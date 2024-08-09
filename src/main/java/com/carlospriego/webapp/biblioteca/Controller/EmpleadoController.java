package com.carlospriego.webapp.biblioteca.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carlospriego.webapp.biblioteca.Model.Empleado;
import com.carlospriego.webapp.biblioteca.Service.EmpleadoService;

@Controller
@RestController
@RequestMapping("empleado")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/")
    public List<Empleado> listarEmpleado(){
        return empleadoService.listarEmpleados();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empleado> buscarEmpleadoPorId(@PathVariable Long nit){
        try {
            Empleado empleado = empleadoService.buscarEmpleadoPorId(nit);
            return ResponseEntity.ok(empleado);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Map<String, String>> guardarEmpleado(Empleado empleado){
        Map<String, String> response = new HashMap<>();
        try {
            empleadoService.guardarEmpleado(empleado);
            response.put("message", "Empleado agregado con exito");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            response.put("message", "Error");
            response.put("err", "Hubo un error al agregar al Empleado");
            return ResponseEntity.badRequest().body(response);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, String>> editarEmpleado(@PathVariable Long nit, @RequestBody Empleado empleadoNuevo){
        Map<String, String> response = new HashMap<>();
        try {
            Empleado empleado = empleadoService.buscarEmpleadoPorId(nit);
            empleado.setApellido(empleadoNuevo.getApellido());
            empleado.setDireccion(empleadoNuevo.getDireccion());
            empleado.setDpi(empleadoNuevo.getDpi());
            empleado.setNombre(empleadoNuevo.getNombre());
            empleado.setNumeroT(empleadoNuevo.getNumeroT());

            response.put("message", "Empleado modificado con exito");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            response.put("message", "Error");
            response.put("err", "Hubo un error al modificar al Empleado");
            return ResponseEntity.badRequest().body(response);
        }
    }

    @DeleteMapping("/libro")
    public ResponseEntity<Map<String, String>> eliminarEmpleado(@RequestParam Long nit){
        Map<String, String> response = new HashMap<>();
        try {
            Empleado empleado = empleadoService.buscarEmpleadoPorId(nit);
            empleadoService.eliminarEmpleado(empleado);
            response.put("message", "Empleado eliminado con exito");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            response.put("message", "Error");
            response.put("err", "Hubo un error al eliminar al Empleado");
            return ResponseEntity.badRequest().body(response);
        }
    }
}
