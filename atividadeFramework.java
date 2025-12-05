package atividade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class atividade {
	
    @GetMapping("/compras")
    public String compras() {
        return "Página de compras";
    }

    @GetMapping("/vendas")
    public String vendas() {
        return "Página de vendas";
    }

    @GetMapping("/estoque")
    public String estoque() {
        return "Página de estoque";
    }

    @GetMapping("/users")
    public String users() {
        return "Página de usuários";
    }

    @GetMapping("/funcionarios")
    public String funcionarios() {
        return "Página de funcionários";
    }

    @GetMapping("/visitantes")
    public String visitantes() {
        return "Página de visitantes";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Página do administrador";
    }
}
