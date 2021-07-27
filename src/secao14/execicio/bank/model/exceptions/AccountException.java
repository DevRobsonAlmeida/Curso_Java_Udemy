/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao14.execicio.bank.model.exceptions;

/**
 *
 * @author 99030499
 */
public class AccountException extends Exception{
    
    public static final long serialVersionUID = 1L;

    public AccountException(String msg) {
        super(msg);
    }
}
