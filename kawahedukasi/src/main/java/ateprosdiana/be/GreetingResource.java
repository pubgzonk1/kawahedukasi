package ateprosdiana.be;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// @Path("/hello")
// @Produces(MediaType.TEXT_PLAIN)
// public class GreetingResource {

//     @GET
//     // @Path("/name")
//     @Produces(MediaType.TEXT_PLAIN)
//     public String get() {
//         return "Nama World GET";
//     }

//     @POST
//     // @Path("/name")
//     @Produces(MediaType.TEXT_PLAIN)
//     public String post() {
//         return "Nama World POST";
//     }

//     @PUT
//     // @Path("/name")
//     @Produces(MediaType.TEXT_PLAIN)
//     public String put() {
//         return "Nama World PUT";
//     }

//     @GET
//     // @Path("/name")
//     @Produces(MediaType.TEXT_PLAIN)
//     public String delete() {
//         return "Nama World DELETE";
//     }
@Path("")
// @Produces(MediaType.TEXT_PLAIN)
public class GreetingResource {
    @GET
    @Path("/info")
    @Produces(MediaType.TEXT_PLAIN)
    public String info() {
        return " ini info";
    }

    @GET
    @Path("/about")
    @Produces(MediaType.TEXT_PLAIN)
    public String about() {
        return " ini about";
    }

    @GET
    @Path("/home")
    @Produces(MediaType.TEXT_PLAIN)
    public String home() {
        return " ini home";
    }

}
