/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao12.enumeracoes.entities;

import java.util.Date;
import secao12.enumeracoes.entities.enums.OrdemStatus;

/**
 *
 * @author robson-pc
 */
public class Order {
    private Integer id;
    private Date moment;
    private OrdemStatus status;

    public Order() {
    }

    public Order(Integer id, Date moment, OrdemStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrdemStatus getStatus() {
        return status;
    }

    public void setStatus(OrdemStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "id=" + id + "\n"
                + "moment=" + moment + "\n"
                + "status=" + status;
    }
    
}
