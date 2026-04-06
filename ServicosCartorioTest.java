import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicosCartorioTest {

    @Test
    public void deveExecutarECancelarRegistroNascimento() {
        IServico servico = new ServicoRegistroNascimento();
        assertEquals("Registro de nascimento efetuado", servico.executar());
        assertEquals("Registro de nascimento cancelado", servico.cancelar());
    }

    @Test
    public void deveExecutarECancelarRegistroCasamento() {
        IServico servico = new ServicoRegistroCasamento();
        assertEquals("Registro de casamento efetuado", servico.executar());
        assertEquals("Registro de casamento cancelado", servico.cancelar());
    }

    @Test
    public void deveExecutarECancelarRegistroObito() {
        IServico servico = new ServicoRegistroObito();
        assertEquals("Registro de óbito efetuado", servico.executar());
        assertEquals("Registro de óbito cancelado", servico.cancelar());
    }

    @Test
    public void deveExecutarECancelarReconhecimentoFirma() {
        IServico servico = new ServicoReconhecimentoFirma();
        assertEquals("Reconhecimento de firma efetuado", servico.executar());
        assertEquals("Reconhecimento de firma cancelado", servico.cancelar());
    }

    @Test
    public void deveExecutarECancelarAutenticacaoDocumento() {
        IServico servico = new ServicoAutenticacaoDocumento();
        assertEquals("Autenticação de documento efetuada", servico.executar());
        assertEquals("Autenticação de documento cancelada", servico.cancelar());
    }
}
