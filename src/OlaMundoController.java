import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class OlaMundoController {

	@Inject private Result result;

	@Get("/olamundo")
	public void olaMundo() {
		result.include("mensagem", "Olá, VRaptor 4!");
	}

}
