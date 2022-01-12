/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.25).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package cn.test.sandbox.core.api;

import cn.test.sandbox.core.model.AuthUserEmail;
import cn.test.sandbox.core.model.AuthUserForgetPwd;
import cn.test.sandbox.core.model.AuthUserLogon;
import cn.test.sandbox.core.model.AuthUserLogonResp;
import cn.test.sandbox.core.model.AuthUserPermissionList;
import cn.test.sandbox.core.model.AuthUserResetPwd;
import cn.test.sandbox.core.model.AuthUserResetPwdByOldPwd;
import cn.test.sandbox.core.model.AuthUserResetPwdNew;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Validated
public interface UserAuthApi {

    @Operation(summary = "", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "", content = @Content(schema = @Schema(implementation = AuthUserPermissionList.class))) })
    @RequestMapping(value = "/user-auth/find-permission-list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<AuthUserPermissionList> userAuthFindPermissionListGet(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="userToken", required=true) String userToken);


    @Operation(summary = "", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "") })
    @RequestMapping(value = "/user-auth/forget-pwd",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> userAuthForgetPwdPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody AuthUserForgetPwd body);


    @Operation(summary = "", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "") })
    @RequestMapping(value = "/user-auth/logoff",
        method = RequestMethod.POST)
    ResponseEntity<Void> userAuthLogoffPost(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="userToken", required=true) String userToken);


    @Operation(summary = "", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "", content = @Content(schema = @Schema(implementation = AuthUserLogonResp.class))) })
    @RequestMapping(value = "/user-auth/logon",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<AuthUserLogonResp> userAuthLogonPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody AuthUserLogon body);


    @Operation(summary = "", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "") })
    @RequestMapping(value = "/user-auth/logon/verification-code",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> userAuthLogonVerificationCodePost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody AuthUserEmail body);


    @Operation(summary = "", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "") })
    @RequestMapping(value = "/user-auth/reset-pwd/by-old-pwd",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> userAuthResetPwdByOldPwdPost(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="userToken", required=true) String userToken, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody AuthUserResetPwdByOldPwd body);


    @Operation(summary = "", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "") })
    @RequestMapping(value = "/user-auth/reset-pwd-new",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> userAuthResetPwdNewPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody AuthUserResetPwdNew body);


    @Operation(summary = "", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "") })
    @RequestMapping(value = "/user-auth/reset-pwd",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> userAuthResetPwdPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody AuthUserResetPwd body);


    @Operation(summary = "", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "") })
    @RequestMapping(value = "/user-auth/reset-pwd/verification-code",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> userAuthResetPwdVerificationCodePost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody AuthUserEmail body);

}
