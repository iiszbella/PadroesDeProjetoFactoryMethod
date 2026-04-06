public class Main {
    public static void main(String[] args) {
        try {
            IServico nascimento = ServicoFactory.obterServico("RegistroNascimento");
            System.out.println(nascimento.executar());
            System.out.println(nascimento.cancelar());

            IServico casamento = ServicoFactory.obterServico("RegistroCasamento");
            System.out.println(casamento.executar());
            System.out.println(casamento.cancelar());

            IServico obito = ServicoFactory.obterServico("RegistroObito");
            System.out.println(obito.executar());
            System.out.println(obito.cancelar());

            IServico firma = ServicoFactory.obterServico("ReconhecimentoFirma");
            System.out.println(firma.executar());
            System.out.println(firma.cancelar());

            IServico documento = ServicoFactory.obterServico("AutenticacaoDocumento");
            System.out.println(documento.executar());
            System.out.println(documento.cancelar());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
