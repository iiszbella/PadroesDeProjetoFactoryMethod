Atividade da disciplina de Padrões de Projeto – Factory Method
O projeto desenvolvido aplica o padrão Factory Method em um cenário de cartório. A ideia central é demonstrar como diferentes serviços podem ser criados de forma flexível e desacoplada, sem que o cliente precise conhecer diretamente as classes concretas.

No modelo proposto, cada serviço do cartório (Registro de Nascimento, Registro de Casamento, Registro de Óbito, Reconhecimento de Firma e Autenticação de Documento) é representado por uma classe que implementa a interface IServico. 
A fábrica (ServicoFactory) é responsável por instanciar dinamicamente o serviço solicitado, garantindo que todos sigam o mesmo contrato de execução e cancelamento.

Escolhi o cartório como cenário para essa atividade porque ele possui diversos serviços distintos, mas que compartilham uma estrutura comum, o que torna o uso do Factory Method ideal para organizar e expandir o sistema.

UML - https://drive.google.com/file/d/1-8O95R_ZWYMiA17aINVls1h9L7YcWriS/view?usp=sharing
