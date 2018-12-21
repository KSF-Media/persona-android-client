/**
 * Persona
 * KSF Media unified login service
 *
 * OpenAPI spec version: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiInvoker;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import org.openapitools.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.openapitools.client.model.InlineResponse400;
import org.openapitools.client.model.InlineResponse403;
import org.openapitools.client.model.InlineResponse4031;
import org.openapitools.client.model.InlineResponse4032;
import org.openapitools.client.model.InlineResponse415;
import org.openapitools.client.model.InlineResponse500;
import org.openapitools.client.model.LoginData;
import org.openapitools.client.model.LoginDataSSO;
import org.openapitools.client.model.LoginDataSoMe;
import org.openapitools.client.model.LoginResponse;
import java.util.UUID;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class LoginApi {
  String basePath = "http://http:/v1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Login with email and password
  * 
   * @param loginData 
   * @return LoginResponse
  */
  public LoginResponse loginPost (LoginData loginData) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = loginData;
    // verify the required parameter 'loginData' is set
    if (loginData == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'loginData' when calling loginPost",
        new ApiException(400, "Missing the required parameter 'loginData' when calling loginPost"));
    }

    // create path and map variables
    String path = "/login";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json;charset=utf-8"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (LoginResponse) ApiInvoker.deserialize(localVarResponse, "", LoginResponse.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Login with email and password
   * 
   * @param loginData 
  */
  public void loginPost (LoginData loginData, final Response.Listener<LoginResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = loginData;

    // verify the required parameter 'loginData' is set
    if (loginData == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'loginData' when calling loginPost",
        new ApiException(400, "Missing the required parameter 'loginData' when calling loginPost"));
    }

    // create path and map variables
    String path = "/login".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json;charset=utf-8"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((LoginResponse) ApiInvoker.deserialize(localVarResponse,  "", LoginResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Login with social media
  * 
   * @param loginDataSoMe 
   * @return LoginResponse
  */
  public LoginResponse loginSomePost (LoginDataSoMe loginDataSoMe) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = loginDataSoMe;
    // verify the required parameter 'loginDataSoMe' is set
    if (loginDataSoMe == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'loginDataSoMe' when calling loginSomePost",
        new ApiException(400, "Missing the required parameter 'loginDataSoMe' when calling loginSomePost"));
    }

    // create path and map variables
    String path = "/login/some";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json;charset=utf-8"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (LoginResponse) ApiInvoker.deserialize(localVarResponse, "", LoginResponse.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Login with social media
   * 
   * @param loginDataSoMe 
  */
  public void loginSomePost (LoginDataSoMe loginDataSoMe, final Response.Listener<LoginResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = loginDataSoMe;

    // verify the required parameter 'loginDataSoMe' is set
    if (loginDataSoMe == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'loginDataSoMe' when calling loginSomePost",
        new ApiException(400, "Missing the required parameter 'loginDataSoMe' when calling loginSomePost"));
    }

    // create path and map variables
    String path = "/login/some".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json;charset=utf-8"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((LoginResponse) ApiInvoker.deserialize(localVarResponse,  "", LoginResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Login with the AccessToken given by the SSO auth
  * 
   * @param loginDataSSO 
   * @return LoginResponse
  */
  public LoginResponse loginSsoPost (LoginDataSSO loginDataSSO) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = loginDataSSO;
    // verify the required parameter 'loginDataSSO' is set
    if (loginDataSSO == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'loginDataSSO' when calling loginSsoPost",
        new ApiException(400, "Missing the required parameter 'loginDataSSO' when calling loginSsoPost"));
    }

    // create path and map variables
    String path = "/login/sso";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json;charset=utf-8"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (LoginResponse) ApiInvoker.deserialize(localVarResponse, "", LoginResponse.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Login with the AccessToken given by the SSO auth
   * 
   * @param loginDataSSO 
  */
  public void loginSsoPost (LoginDataSSO loginDataSSO, final Response.Listener<LoginResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = loginDataSSO;

    // verify the required parameter 'loginDataSSO' is set
    if (loginDataSSO == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'loginDataSSO' when calling loginSsoPost",
        new ApiException(400, "Missing the required parameter 'loginDataSSO' when calling loginSsoPost"));
    }

    // create path and map variables
    String path = "/login/sso".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json;charset=utf-8"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((LoginResponse) ApiInvoker.deserialize(localVarResponse,  "", LoginResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Logout
  * Authorization header expects the following format ‘OAuth {token}’
   * @param uuid 
   * @param authorization 
   * @return List<Object>
  */
  public List<Object> loginUuidDelete (UUID uuid, String authorization) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'uuid' when calling loginUuidDelete",
        new ApiException(400, "Missing the required parameter 'uuid' when calling loginUuidDelete"));
    }

    // create path and map variables
    String path = "/login/{uuid}".replaceAll("\\{" + "uuid" + "\\}", apiInvoker.escapeString(uuid.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<Object>) ApiInvoker.deserialize(localVarResponse, "array", Object.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Logout
   * Authorization header expects the following format ‘OAuth {token}’
   * @param uuid    * @param authorization 
  */
  public void loginUuidDelete (UUID uuid, String authorization, final Response.Listener<List<Object>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'uuid' when calling loginUuidDelete",
        new ApiException(400, "Missing the required parameter 'uuid' when calling loginUuidDelete"));
    }

    // create path and map variables
    String path = "/login/{uuid}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "uuid" + "\\}", apiInvoker.escapeString(uuid.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<Object>) ApiInvoker.deserialize(localVarResponse,  "array", Object.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
