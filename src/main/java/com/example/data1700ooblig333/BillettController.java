package com.example.data1700ooblig333;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BillettController {

    @Autowired
    BillettRepository rep;

    @PostMapping("/lagre")
    public void lagreBillett(Billett billett){
        rep.lagreBillett(billett);
    }
    @GetMapping("/hentAlle")
    public List <Billett> hentAlle(){
        return rep.hentAlle();
    }
    @GetMapping("/slettAlle")
    public void slettAlle(){
        rep.slettAlle();
    }
}
