/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.ejer1;

/**
 *
 * @author soporte
 */
public class JqueryUI extends ContainerTag{
    public JqueryUI(){
        super(JqueryHeader.class,JqueryBody.class);
    }

    @Override
    public String getName() {
        return "html";
    }
    
}
