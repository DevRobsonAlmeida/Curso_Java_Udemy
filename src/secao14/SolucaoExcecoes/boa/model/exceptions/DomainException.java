/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao14.SolucaoExcecoes.boa.model.exceptions;

/**
 *
 * @author 99030499
 */
public class DomainException extends Exception{
    
    public static final long serialVersionUID = 1L;
    
    public DomainException(String msg){
        super(msg);
    }
}
