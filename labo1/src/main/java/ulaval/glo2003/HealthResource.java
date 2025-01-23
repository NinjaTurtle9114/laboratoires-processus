package ulaval.glo2003;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import javax.print.attribute.standard.Media;

@Path("/products")
public class HealthResource {
    @GET
    public Response health() {
        return Response.ok("OK").build();
    }

    @GET
    @Path("/{id}")
    public Response getProducts(@PathParam("id") String id) {
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String addProduct(Product product) {
        return product.toString();
    }
}
