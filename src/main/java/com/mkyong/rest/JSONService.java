package com.mkyong.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mkyong.Track;

@Path("/json/discos")
public class JSONService {

	@GET //@Path("/get")
        @Produces(MediaType.APPLICATION_JSON)
	public Track[] getTrackInJSON() {
                Track[] tracks = new Track[3];
                
		Track track1 = new Track();
		track1.setTitulo("Fuel");
		track1.setBanda("Metallica");
                
                tracks[0] = track1;
                
                Track track2 = new Track();
		track2.setTitulo("Bloddy");
		track2.setBanda("Rockafeller");
                
                tracks[1] = track2;
                
                Track track3 = new Track();
		track3.setTitulo("Enter Sandman");
		track3.setBanda("Foofighters");
                
                tracks[2] = track3;

		return tracks;
	}

	@POST //@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {

		String resultado = "Registro Salvo : " + track;
		return Response.status(201).entity(resultado).build();
		
	}
	
}