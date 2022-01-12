package cn.test.sandbox.core.api;

import cn.test.sandbox.core.model.RoleMgtCreate;
import cn.test.sandbox.core.model.RoleMgtId;
import cn.test.sandbox.core.model.RoleMgtItem;
import cn.test.sandbox.core.model.RoleMgtList;
import cn.test.sandbox.core.model.RoleMgtUpdate;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
public class RoleMgtApiController implements RoleMgtApi {

    private static final Logger log = LoggerFactory.getLogger(RoleMgtApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RoleMgtApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<RoleMgtItem> roleMgtCreatePost(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="userToken", required=true) String userToken,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody RoleMgtCreate body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RoleMgtItem>(objectMapper.readValue("{\n  \"roleDesc\" : \"roleDesc\",\n  \"roleId\" : \"roleId\",\n  \"roleName\" : \"roleName\",\n  \"permissionList\" : [ {\n    \"permissionId\" : \"permissionId\",\n    \"childNodes\" : [ null, null ],\n    \"permissionName\" : \"permissionName\"\n  }, {\n    \"permissionId\" : \"permissionId\",\n    \"childNodes\" : [ null, null ],\n    \"permissionName\" : \"permissionName\"\n  } ],\n  \"roleType\" : \"roleType\"\n}", RoleMgtItem.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RoleMgtItem>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RoleMgtItem>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> roleMgtDeletePost(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="userToken", required=true) String userToken,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody RoleMgtId body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RoleMgtList> roleMgtFindAllGet(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="userToken", required=true) String userToken) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RoleMgtList>(objectMapper.readValue("{\n  \"items\" : [ {\n    \"roleDesc\" : \"roleDesc\",\n    \"roleId\" : \"roleId\",\n    \"roleName\" : \"roleName\",\n    \"permissionList\" : [ {\n      \"permissionId\" : \"permissionId\",\n      \"childNodes\" : [ null, null ],\n      \"permissionName\" : \"permissionName\"\n    }, {\n      \"permissionId\" : \"permissionId\",\n      \"childNodes\" : [ null, null ],\n      \"permissionName\" : \"permissionName\"\n    } ],\n    \"roleType\" : \"roleType\"\n  }, {\n    \"roleDesc\" : \"roleDesc\",\n    \"roleId\" : \"roleId\",\n    \"roleName\" : \"roleName\",\n    \"permissionList\" : [ {\n      \"permissionId\" : \"permissionId\",\n      \"childNodes\" : [ null, null ],\n      \"permissionName\" : \"permissionName\"\n    }, {\n      \"permissionId\" : \"permissionId\",\n      \"childNodes\" : [ null, null ],\n      \"permissionName\" : \"permissionName\"\n    } ],\n    \"roleType\" : \"roleType\"\n  } ]\n}", RoleMgtList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RoleMgtList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RoleMgtList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RoleMgtItem> roleMgtUpdatePost(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="userToken", required=true) String userToken,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody RoleMgtUpdate body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RoleMgtItem>(objectMapper.readValue("{\n  \"roleDesc\" : \"roleDesc\",\n  \"roleId\" : \"roleId\",\n  \"roleName\" : \"roleName\",\n  \"permissionList\" : [ {\n    \"permissionId\" : \"permissionId\",\n    \"childNodes\" : [ null, null ],\n    \"permissionName\" : \"permissionName\"\n  }, {\n    \"permissionId\" : \"permissionId\",\n    \"childNodes\" : [ null, null ],\n    \"permissionName\" : \"permissionName\"\n  } ],\n  \"roleType\" : \"roleType\"\n}", RoleMgtItem.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RoleMgtItem>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RoleMgtItem>(HttpStatus.NOT_IMPLEMENTED);
    }

}
