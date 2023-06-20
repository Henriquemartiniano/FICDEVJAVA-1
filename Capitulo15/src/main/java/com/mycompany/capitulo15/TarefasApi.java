package com.mycompany.capitulo15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@SpringBootApplication
@RestController
@RequestMapping ("/api/tarefas")
public class TarefasApi {
private List < String > tarefas = new ArrayList < >() ;
@GetMapping
public List < String > listarTodasTarefas () {
return  getTarefas() ;
}
@PostMapping
public void criarTarefa ( @RequestBody String tarefa ) {
        getTarefas() . add ( tarefa ) ;
}
@DeleteMapping ("/{index}")
public void apagarTarefa ( @PathVariable int id ) { if ( id >= 0 && id < getTarefas() . size () ) {
            getTarefas() . remove ( id ) ;
}
}
public static void main ( String [] args ) {
SpringApplication . run ( TarefasApi .class , args ) ;
}

    /**
     * @return the tarefas
     */
    public List < String > getTarefas() {
        return tarefas;
    }

    /**
     * @param tarefas the tarefas to set
     */
    public void setTarefas(List < String > tarefas) {
        this.tarefas = tarefas;
    }
}