package com.example.demo.controller;

import java.util.List;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Proveedor;
import com.example.demo.service.Impl.ProveedorService;


@Controller
@RequestMapping("/crud")
public class ProveedorController {
    @Autowired
    private ProveedorService proveedorService;

    @GetMapping("/")
    public String listar(Model model) {
        List<Proveedor> lista = proveedorService.ListarTodos();

        model.addAttribute("titulo", "LISTA DE PROVEEDORES");
        model.addAttribute("proveedores", lista);
        return "listado";
    }

    @GetMapping("/crear")
    public String crear(Model model) {
        Proveedor proveedor = new Proveedor();

        model.addAttribute("titulo", "NUEVO PROVEEDOR");
        model.addAttribute("proveedor", proveedor);

        return "frmEditar";
    }

    @PostMapping("/save")
    public String grabar(@Valid @ModelAttribute Proveedor proveedor, BindingResult result, Model model) {

        if (result.hasErrors()) {

            model.addAttribute("titulo", "NUEVO PROVEEDOR");
            model.addAttribute("proveedor", proveedor);
            System.out.println("Existieron errores en el formulario");

            return "frmEditar";
        }

        proveedorService.grabar(proveedor);
        System.out.println("Proveedor grabado con exito!");
        return "redirect:/crud/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model) {
        Proveedor proveedor = proveedorService.buscarPorId(id);

        model.addAttribute("titulo", "EDITAR PROVEEDOR");
        model.addAttribute("proveedor", proveedor);

        return "frmEditar";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long id) {
        proveedorService.eliminar(id);
        System.out.println("Vehiculo eliminado con exito!");

        return "redirect:/crud/";
    }

}
