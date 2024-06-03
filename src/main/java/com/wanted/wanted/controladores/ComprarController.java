package com.wanted.wanted.controladores;


import com.wanted.wanted.entidades.*;
import com.wanted.wanted.servicios.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Controller


public class ComprarController {
    private  final FiguraServices figuraServices;



    /**
     * Aqui tenemso que coger la id de cada de los que queramos olo la informacion que se va a monstrar en la pagina web
     * Despues de eso hacemos un formulario donde llenar los datos y con seguyridad hacemso que si estas registrado no te
     * salga el nombre ni el apellido pero si que tenga que poner la tarjeta para pagar
     */


/*
    @GetMapping("/comprar")
    public String comprar(@RequestParam("id") Long id, Model model) {
       Optional<Figura>  figura = figuraServices.findById(id);
        model.addAttribute("figura", figura);

        if (figura.isPresent()) {
            Figura figura2 = figura.get();
            model.addAttribute("figura", figura2);
            return "html/comprar/comprar"; // Devolver la vista de detalle
        }else{

            return "redirect:html/inicio";
        }




    }
*/


    @GetMapping("/comprar/novedad")
    public String comprarNovedad(@RequestParam("id") Long id, Model model) {
        // Obtener el objeto con el ID especificado y pasarlo al modelo
        Optional<Figura> novedad = figuraServices.findById(id);

        if (novedad.isPresent()) {
            Figura novedad1 = novedad.get();
            model.addAttribute("figura", novedad1);
            return "html/comprar/comprar"; // Devolver la vista de detalle
        } else {

            return "redirect:/inicio";
        }


    }


    @GetMapping("/comprar/onePiece")
    public String comprarOnePiece(@RequestParam("id") Long id, Model model) {
        // Obtener el objeto con el ID especificado y pasarlo al modelo
        Optional<Figura> onePiece = figuraServices.findById(id);

        if (onePiece.isPresent()) {
            Figura  onePiece2 = onePiece.get();
            model.addAttribute("figura", onePiece2);
            return "html/comprar/comprar"; // Devolver la vista de detalle
        } else {

            return "redirect:/inicio";
        }


    }

    @GetMapping("/comprar/dragon")
    public String comprarDragonBall(@RequestParam("id") Long id, Model model) {
        // Obtener el objeto con el ID especificado y pasarlo al modelo
        Optional<Figura> dragon = figuraServices.findById(id);

        if (dragon.isPresent()) {
            Figura dragonBall2 = dragon.get();
            model.addAttribute("figura", dragonBall2);
            return "html/comprar/comprar"; // Devolver la vista de detalle
        } else {

            return "redirect:/inicio";
        }


    }


    @GetMapping("/comprar/naruto")
    public String comprarNaruto(@RequestParam("id") Long id, Model model) {
        // Obtener el objeto con el ID especificado y pasarlo al modelo
        Optional<Figura> naruto = figuraServices.findById(id);

        if (naruto.isPresent()) {
            Figura naruto2 = naruto.get();
            model.addAttribute("figura", naruto2);
            return "html/comprar/comprar"; // Devolver la vista de detalle
        } else {

            return "redirect:/inicio";
        }


    }
}
