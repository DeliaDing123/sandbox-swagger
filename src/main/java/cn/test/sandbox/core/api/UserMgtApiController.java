package cn.test.sandbox.core.api;

import cn.test.sandbox.core.model.UserMgtCreate;
import cn.test.sandbox.core.model.UserMgtId;
import cn.test.sandbox.core.model.UserMgtItem;
import cn.test.sandbox.core.model.UserMgtList;
import cn.test.sandbox.core.model.UserMgtUpdate;
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
public class UserMgtApiController implements UserMgtApi {

    private static final Logger log = LoggerFactory.getLogger(UserMgtApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserMgtApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<UserMgtItem> userMgtCreatePost(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="userToken", required=true) String userToken,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody UserMgtCreate body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserMgtItem>(objectMapper.readValue("{\n  \"organizationType\" : \"organizationType\",\n  \"userStatus\" : \"Active\",\n  \"phoneNumber\" : \"phoneNumber\",\n  \"companyName\" : \"companyName\",\n  \"userEmail\" : \"userEmail\",\n  \"userType\" : \"userType\",\n  \"partnerId\" : \"partnerId\",\n  \"roleList\" : [ {\n    \"roleDesc\" : \"roleDesc\",\n    \"roleId\" : \"roleId\",\n    \"roleName\" : \"roleName\",\n    \"permissionList\" : [ {\n      \"permissionId\" : \"permissionId\",\n      \"childNodes\" : [ null, null ],\n      \"permissionName\" : \"permissionName\"\n    }, {\n      \"permissionId\" : \"permissionId\",\n      \"childNodes\" : [ null, null ],\n      \"permissionName\" : \"permissionName\"\n    } ],\n    \"roleType\" : \"roleType\"\n  }, {\n    \"roleDesc\" : \"roleDesc\",\n    \"roleId\" : \"roleId\",\n    \"roleName\" : \"roleName\",\n    \"permissionList\" : [ {\n      \"permissionId\" : \"permissionId\",\n      \"childNodes\" : [ null, null ],\n      \"permissionName\" : \"permissionName\"\n    }, {\n      \"permissionId\" : \"permissionId\",\n      \"childNodes\" : [ null, null ],\n      \"permissionName\" : \"permissionName\"\n    } ],\n    \"roleType\" : \"roleType\"\n  } ]\n}", UserMgtItem.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserMgtItem>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserMgtItem>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> userMgtDeletePost(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="userToken", required=true) String userToken,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody UserMgtId body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserMgtList> userMgtFindAllGet(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="userToken", required=true) String userToken,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "userEmailLike", required = false) String userEmailLike,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "phoneNumberLike", required = false) String phoneNumberLike,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "companyNameLike", required = false) String companyNameLike,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "partnerIdLike", required = false) String partnerIdLike) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserMgtList>(objectMapper.readValue("{\n  \"pageable\" : {\n    \"pageNumber\" : 0,\n    \"totalPages\" : 1,\n    \"pageSize\" : 6,\n    \"totalElements\" : 5\n  },\n  \"items\" : [ {\n    \"organizationType\" : \"organizationType\",\n    \"userStatus\" : \"Active\",\n    \"phoneNumber\" : \"phoneNumber\",\n    \"companyName\" : \"companyName\",\n    \"userEmail\" : \"userEmail\",\n    \"userType\" : \"userType\",\n    \"partnerId\" : \"partnerId\",\n    \"roleList\" : [ {\n      \"roleDesc\" : \"roleDesc\",\n      \"roleId\" : \"roleId\",\n      \"roleName\" : \"roleName\",\n      \"permissionList\" : [ {\n        \"permissionId\" : \"permissionId\",\n        \"childNodes\" : [ null, null ],\n        \"permissionName\" : \"permissionName\"\n      }, {\n        \"permissionId\" : \"permissionId\",\n        \"childNodes\" : [ null, null ],\n        \"permissionName\" : \"permissionName\"\n      } ],\n      \"roleType\" : \"roleType\"\n    }, {\n      \"roleDesc\" : \"roleDesc\",\n      \"roleId\" : \"roleId\",\n      \"roleName\" : \"roleName\",\n      \"permissionList\" : [ {\n        \"permissionId\" : \"permissionId\",\n        \"childNodes\" : [ null, null ],\n        \"permissionName\" : \"permissionName\"\n      }, {\n        \"permissionId\" : \"permissionId\",\n        \"childNodes\" : [ null, null ],\n        \"permissionName\" : \"permissionName\"\n      } ],\n      \"roleType\" : \"roleType\"\n    } ]\n  }, {\n    \"organizationType\" : \"organizationType\",\n    \"userStatus\" : \"Active\",\n    \"phoneNumber\" : \"phoneNumber\",\n    \"companyName\" : \"companyName\",\n    \"userEmail\" : \"userEmail\",\n    \"userType\" : \"userType\",\n    \"partnerId\" : \"partnerId\",\n    \"roleList\" : [ {\n      \"roleDesc\" : \"roleDesc\",\n      \"roleId\" : \"roleId\",\n      \"roleName\" : \"roleName\",\n      \"permissionList\" : [ {\n        \"permissionId\" : \"permissionId\",\n        \"childNodes\" : [ null, null ],\n        \"permissionName\" : \"permissionName\"\n      }, {\n        \"permissionId\" : \"permissionId\",\n        \"childNodes\" : [ null, null ],\n        \"permissionName\" : \"permissionName\"\n      } ],\n      \"roleType\" : \"roleType\"\n    }, {\n      \"roleDesc\" : \"roleDesc\",\n      \"roleId\" : \"roleId\",\n      \"roleName\" : \"roleName\",\n      \"permissionList\" : [ {\n        \"permissionId\" : \"permissionId\",\n        \"childNodes\" : [ null, null ],\n        \"permissionName\" : \"permissionName\"\n      }, {\n        \"permissionId\" : \"permissionId\",\n        \"childNodes\" : [ null, null ],\n        \"permissionName\" : \"permissionName\"\n      } ],\n      \"roleType\" : \"roleType\"\n    } ]\n  } ]\n}", UserMgtList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserMgtList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserMgtList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserMgtItem> userMgtUpdatePost(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="userToken", required=true) String userToken,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody UserMgtUpdate body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserMgtItem>(objectMapper.readValue("{\n  \"organizationType\" : \"organizationType\",\n  \"userStatus\" : \"Active\",\n  \"phoneNumber\" : \"phoneNumber\",\n  \"companyName\" : \"companyName\",\n  \"userEmail\" : \"userEmail\",\n  \"userType\" : \"userType\",\n  \"partnerId\" : \"partnerId\",\n  \"roleList\" : [ {\n    \"roleDesc\" : \"roleDesc\",\n    \"roleId\" : \"roleId\",\n    \"roleName\" : \"roleName\",\n    \"permissionList\" : [ {\n      \"permissionId\" : \"permissionId\",\n      \"childNodes\" : [ null, null ],\n      \"permissionName\" : \"permissionName\"\n    }, {\n      \"permissionId\" : \"permissionId\",\n      \"childNodes\" : [ null, null ],\n      \"permissionName\" : \"permissionName\"\n    } ],\n    \"roleType\" : \"roleType\"\n  }, {\n    \"roleDesc\" : \"roleDesc\",\n    \"roleId\" : \"roleId\",\n    \"roleName\" : \"roleName\",\n    \"permissionList\" : [ {\n      \"permissionId\" : \"permissionId\",\n      \"childNodes\" : [ null, null ],\n      \"permissionName\" : \"permissionName\"\n    }, {\n      \"permissionId\" : \"permissionId\",\n      \"childNodes\" : [ null, null ],\n      \"permissionName\" : \"permissionName\"\n    } ],\n    \"roleType\" : \"roleType\"\n  } ]\n}", UserMgtItem.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserMgtItem>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserMgtItem>(HttpStatus.NOT_IMPLEMENTED);
    }

}
