/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao14;

/**
 *
 * @author 99030499
 */
public class Readme {
    /**
     *  > Exceções
     *      Uma exceção é qualquer condição de erro ou comportamento
     *      insperado encontrado por programa em execução
     * 
     *      Em Java, uma exeção é um objeto herdado da classe:
     *          java.lang.Exception - O compilador obriga a tratar ou propagar
     *          java.lang.RuntimeException - O compilador não obriga a tratar ou propagar
     * 
     *      Quando lançada, uma exceção é propaganda na pilha de chamadas de métodos em execução, 
     *      até que seja capturada(tratada) ou o programa seja encerrado
     * 
     * 
     *      Throwable
     *        |__ Error // Erros que não se espera que o programador trate
     *        |   |___ OutOFMemoryError // Quando a memoria "estoura"
     *        |   |___ VirturalMachineError // Erro na maquina virtual do java
     *        |__ Expection // Que se espera que o programa trate
     *               |__ IOException // Erro de entra e saida de dados
     *               |__ RuntimeException // Expecifica exceções que o programa não irar tratar
     *                          |__IndexOutOfBoundsException // Tente acessar um incide de um array que existe
     *                          |__NullPointerException // Quando acessar uma variavel que está valendo nulo
     * 
     * 
     * 
     *      Pra que exceções ?
     *          O modelo de trabamento de exceções permite que erros sejam tratados
     *          de forma consistente e fléxivel, usando boas práticas
     * 
     *          * Vantagens:
     *              - Delega a lógica do erro para classe responsável por conhecer as regras que podem ocasionar o erro
     *              - Trata de form organizada (inclusive hierárquica) execeções de tipos diferentes
     *              - A exceção pode carregar dados quaisquer
     * 
     * 
     *      Estrutura try - catch e finally
     *         * Bloco try 
     *              -  Contém o código que representa a execução normal do trecho de código que pode acarretar em uma exceção
     *         * Bloco catch
     *              - Contém o codigo a ser executado caso uma exceção ocorra
     *              - Deve ser especificado o tipo da exceção a ser tratada(upcasting é permitido)
     *         * Bloco finally 
     *              - É um bloco que contém código a ser executado independentemente de ter ocorrido ou não uma exceção
     *              - Exemplo clássico:  fechar um arquivo, conexão de banco de dados, ou outro recurso específico ao final do processomento.
     * 
     *          
     * 
     *      - Sugestão de pacotes "model" -
     *          model
     *            |__ entites
     *            |__ enums
     *            |__ exception
     *            |__ services
     * 
     *      
     * 
     *      - R E S U M O  D A  A U L A
     *          * Cláusula throws: propaga a exceção ao invés de trata-la
     *          * Cláusula throw: lança a exceção / "corta" o método
     *          
     *          * Exception: compilador obriga a tratar ou propagar
     *          * RuntimeException: compilador não obriga
     * 
     *          * O modelo de tratamento de exceções permite que erros sejam 
     *            tratados de forma consistente e flexível, usando boas práticas
     *          * Vantagens:
     *                  - Lógica delegada
     *                  - Construtores podem ter tratamento de exceções
     *                  - Possibilidade de auxílio do compilador(Exception)
     *                  - Código mais simples. Não há aninhamento de condicionais: a qualquer momento que uma 
     *                    exceção for disparada, a execução é interrompida e cai no bloco catch corresponte.
     *                  - É possivel capturar inclusive outras exceções de sistema
     * 
     * 
     * 
     */                         
}
