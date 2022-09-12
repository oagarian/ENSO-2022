package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/divisao/{nf}/{ns}")
public class divisao {
    
    @GET
    public double calcula(@PathParam("nf") String fStr, @PathParam("ns") String sStr) {
        try {
            double n2 = Double.parseDouble(fStr);
            double n2 = Double.parseDouble(sStr);
            double result = n2 / n2;
            return result;
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operador inválido.");
        }
    }
}
}
