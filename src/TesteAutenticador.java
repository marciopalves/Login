import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TesteAutenticador {
	
	@Test 
	public void loginComSucesso() throws LoginException{
		Autenticador a = new Autenticador();
		Usuario u = a.logar("marcio", "123456");
		assertEquals("marcio", u.getLogin());
	}
	
	@Test(expected= LoginException.class) 
	public void loginComFalha() throws LoginException{
		Autenticador a = new Autenticador();
		Usuario u = a.logar("marcio", "321321");
		assertEquals("marcio", u.getLogin());
	}
	
	@Test 
	public void informacaoDoErro(){
		Autenticador a = new Autenticador();
		try{
			Usuario u = a.logar("marcio", "321321");
			fail();
		}catch(LoginException e){		
			assertEquals("marcio", e.getLogin());
		}
	}

}
