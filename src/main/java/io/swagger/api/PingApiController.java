package io.swagger.api;

import io.swagger.model.Ping;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-16T14:12:26.096Z")

@Controller
public class PingApiController implements PingApi {

    private static final Logger log = LoggerFactory.getLogger(PingApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PingApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Ping> getPing() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Ping>(objectMapper.readValue("{  \"text\" : \"Hello World\"}", Ping.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Ping>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Ping>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Ping> postPing(@ApiParam(value = "Message to print" ,required=true )  @Valid @RequestBody Ping body) {
        String accept = request.getHeader("Accept");
		String stext = "Yoooooooo";
		try {
			return new ResponseEntity<Ping>(objectMapper.readValue("{ \"text\" :\" " + stext + "\"}", Ping.class), HttpStatus.CREATED);
		} catch (IOException e) {
            return new ResponseEntity<Ping>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
        //return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
