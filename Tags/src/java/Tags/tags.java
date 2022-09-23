/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;
import java.time.LocalTime;

/**
 *
 * @author Alexis Pérez
 * Matrícula: 2942889
 */
public class tags extends SimpleTagSupport{
    
    StringWriter sw = new StringWriter();

    @Override
    public void doTag() throws JspException, IOException {
        
        getJspBody().invoke(sw);
        getJspContext().getOut().println(sw.toString() + "  " + LocalTime.now());
    }
        
}
