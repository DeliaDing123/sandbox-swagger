package cn.test.sandbox.core.api;

import cn.test.sandbox.core.model.AuthorizedProductFiles;
import cn.test.sandbox.core.model.LicensePortalDetails;
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
public class LicensePortalApiController implements LicensePortalApi {

    private static final Logger log = LoggerFactory.getLogger(LicensePortalApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LicensePortalApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<AuthorizedProductFiles> licensePortalAuthorizedProductFileListGet(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="userToken", required=true) String userToken,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "productId", required = true) String productId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuthorizedProductFiles>(objectMapper.readValue("{\n  \"dtFrontToken\" : \"dtFrontToken\",\n  \"authorizedProductFileList\" : {\n    \"items\" : [ {\n      \"fileName\" : \"fileName\",\n      \"cosObjectKey\" : \"cosObjectKey\",\n      \"fileDesc\" : \"fileDesc\"\n    }, {\n      \"fileName\" : \"fileName\",\n      \"cosObjectKey\" : \"cosObjectKey\",\n      \"fileDesc\" : \"fileDesc\"\n    } ]\n  }\n}", AuthorizedProductFiles.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuthorizedProductFiles>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuthorizedProductFiles>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LicensePortalDetails> licensePortalFindDetailsGet(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="userToken", required=true) String userToken) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LicensePortalDetails>(objectMapper.readValue("{\n  \"authorizedTo\" : \"authorizedTo\",\n  \"partnerEmail\" : \"partnerEmail\",\n  \"currentUser\" : \"currentUser\",\n  \"partnerStatus\" : \"partnerStatus\",\n  \"partnerName\" : \"partnerName\",\n  \"partnerPhoneNumber\" : \"partnerPhoneNumber\",\n  \"authorizedProductList\" : {\n    \"items\" : [ {\n      \"descCN\" : \"descCN\",\n      \"icon\" : \"icon\",\n      \"isDownloadAvailable\" : true,\n      \"productList\" : [ {\n        \"productVersion\" : \"productVersion\",\n        \"productId\" : \"productId\"\n      }, {\n        \"productVersion\" : \"productVersion\",\n        \"productId\" : \"productId\"\n      } ],\n      \"productType\" : \"productType\",\n      \"desc\" : \"desc\"\n    }, {\n      \"descCN\" : \"descCN\",\n      \"icon\" : \"icon\",\n      \"isDownloadAvailable\" : true,\n      \"productList\" : [ {\n        \"productVersion\" : \"productVersion\",\n        \"productId\" : \"productId\"\n      }, {\n        \"productVersion\" : \"productVersion\",\n        \"productId\" : \"productId\"\n      } ],\n      \"productType\" : \"productType\",\n      \"desc\" : \"desc\"\n    } ]\n  },\n  \"partnerRepresentative\" : \"partnerRepresentative\"\n}", LicensePortalDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LicensePortalDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LicensePortalDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

}
