package com.mezcaalng.botellatb.web;

import com.mezcaalng.botellatb.model.Producto;
import com.mezcaalng.botellatb.service.ProductoService;
import com.mezcaalng.botellatb.util.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BotellaTBController {
    private static Logger log = LoggerFactory.getLogger(BotellaTBController.class);
    Utils utils = new Utils();

    @Autowired
    private ProductoService productoService;

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/getallproducts")
    public ResponseEntity<List<Producto>> getAllProducts() {
        List<Producto> list = productoService.getAllProducts();
         return new ResponseEntity<List<Producto>>(list, HttpStatus.OK);
    }

}
