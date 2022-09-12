package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/soma/{nf}/{ns}/")
public class Soma {
    
    @GET
    public double calcula(@PathParam("nf") String fStr, @PathParam("ns") String sStr) {
        try {
            double n1 = Double.parseDouble(fStr);
            double n2 = Double.parseDouble(sStr);
            double result = n1 + n2;
            return result;
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operador inválido.");
        }
    }
}
