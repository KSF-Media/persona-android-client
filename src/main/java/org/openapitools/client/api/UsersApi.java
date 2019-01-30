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

import org.openapitools.client.model.GdprConsent;
import org.openapitools.client.model.InlineResponse400;
import org.openapitools.client.model.InlineResponse415;
import java.util.*;
import org.openapitools.client.model.LoginResponse;
import org.openapitools.client.model.NewUser;
import java.util.UUID;
import org.openapitools.client.model.User;
import org.openapitools.client.model.UserUpdate;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class UsersApi {
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
  * Create a new user.
  * 
   * @param newUser 
   * @return LoginResponse
  */
  public LoginResponse usersPost (NewUser newUser) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = newUser;
    // verify the required parameter 'newUser' is set
    if (newUser == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'newUser' when calling usersPost",
        new ApiException(400, "Missing the required parameter 'newUser' when calling usersPost"));
    }

    // create path and map variables
    String path = "/users";

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
   * Create a new user.
   * 
   * @param newUser 
  */
  public void usersPost (NewUser newUser, final Response.Listener<LoginResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = newUser;

    // verify the required parameter 'newUser' is set
    if (newUser == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'newUser' when calling usersPost",
        new ApiException(400, "Missing the required parameter 'newUser' when calling usersPost"));
    }

    // create path and map variables
    String path = "/users".replaceAll("\\{format\\}","json");

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
  * Updates the GDPR consent settings for a given user.
  * Authorization header expects the following format ‘OAuth {token}’
   * @param uuid 
   * @param gdprConsent 
   * @param authorization 
   * @return User
  */
  public User usersUuidGdprPut (UUID uuid, List<GdprConsent> gdprConsent, String authorization) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = gdprConsent;
    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'uuid' when calling usersUuidGdprPut",
        new ApiException(400, "Missing the required parameter 'uuid' when calling usersUuidGdprPut"));
    }
    // verify the required parameter 'gdprConsent' is set
    if (gdprConsent == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'gdprConsent' when calling usersUuidGdprPut",
        new ApiException(400, "Missing the required parameter 'gdprConsent' when calling usersUuidGdprPut"));
    }

    // create path and map variables
    String path = "/users/{uuid}/gdpr".replaceAll("\\{" + "uuid" + "\\}", apiInvoker.escapeString(uuid.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (User) ApiInvoker.deserialize(localVarResponse, "", User.class);
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
   * Updates the GDPR consent settings for a given user.
   * Authorization header expects the following format ‘OAuth {token}’
   * @param uuid    * @param gdprConsent    * @param authorization 
  */
  public void usersUuidGdprPut (UUID uuid, List<GdprConsent> gdprConsent, String authorization, final Response.Listener<User> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = gdprConsent;

    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'uuid' when calling usersUuidGdprPut",
        new ApiException(400, "Missing the required parameter 'uuid' when calling usersUuidGdprPut"));
    }
    // verify the required parameter 'gdprConsent' is set
    if (gdprConsent == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'gdprConsent' when calling usersUuidGdprPut",
        new ApiException(400, "Missing the required parameter 'gdprConsent' when calling usersUuidGdprPut"));
    }

    // create path and map variables
    String path = "/users/{uuid}/gdpr".replaceAll("\\{format\\}","json").replaceAll("\\{" + "uuid" + "\\}", apiInvoker.escapeString(uuid.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));

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
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((User) ApiInvoker.deserialize(localVarResponse,  "", User.class));
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
  * Get user by UUID.
  * Authorization header expects the following format ‘OAuth {token}’
   * @param uuid 
   * @param authorization 
   * @param cacheControl 
   * @return User
  */
  public User usersUuidGet (UUID uuid, String authorization, String cacheControl) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'uuid' when calling usersUuidGet",
        new ApiException(400, "Missing the required parameter 'uuid' when calling usersUuidGet"));
    }

    // create path and map variables
    String path = "/users/{uuid}".replaceAll("\\{" + "uuid" + "\\}", apiInvoker.escapeString(uuid.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("Cache-Control", ApiInvoker.parameterToString(cacheControl));
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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (User) ApiInvoker.deserialize(localVarResponse, "", User.class);
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
   * Get user by UUID.
   * Authorization header expects the following format ‘OAuth {token}’
   * @param uuid    * @param authorization    * @param cacheControl 
  */
  public void usersUuidGet (UUID uuid, String authorization, String cacheControl, final Response.Listener<User> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'uuid' when calling usersUuidGet",
        new ApiException(400, "Missing the required parameter 'uuid' when calling usersUuidGet"));
    }

    // create path and map variables
    String path = "/users/{uuid}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "uuid" + "\\}", apiInvoker.escapeString(uuid.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("Cache-Control", ApiInvoker.parameterToString(cacheControl));

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
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((User) ApiInvoker.deserialize(localVarResponse,  "", User.class));
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
  * Update a user
  * Authorization header expects the following format ‘OAuth {token}’
   * @param uuid 
   * @param userUpdate 
   * @param authorization 
   * @return User
  */
  public User usersUuidPatch (UUID uuid, UserUpdate userUpdate, String authorization) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = userUpdate;
    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'uuid' when calling usersUuidPatch",
        new ApiException(400, "Missing the required parameter 'uuid' when calling usersUuidPatch"));
    }
    // verify the required parameter 'userUpdate' is set
    if (userUpdate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userUpdate' when calling usersUuidPatch",
        new ApiException(400, "Missing the required parameter 'userUpdate' when calling usersUuidPatch"));
    }

    // create path and map variables
    String path = "/users/{uuid}".replaceAll("\\{" + "uuid" + "\\}", apiInvoker.escapeString(uuid.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (User) ApiInvoker.deserialize(localVarResponse, "", User.class);
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
   * Update a user
   * Authorization header expects the following format ‘OAuth {token}’
   * @param uuid    * @param userUpdate    * @param authorization 
  */
  public void usersUuidPatch (UUID uuid, UserUpdate userUpdate, String authorization, final Response.Listener<User> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = userUpdate;

    // verify the required parameter 'uuid' is set
    if (uuid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'uuid' when calling usersUuidPatch",
        new ApiException(400, "Missing the required parameter 'uuid' when calling usersUuidPatch"));
    }
    // verify the required parameter 'userUpdate' is set
    if (userUpdate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userUpdate' when calling usersUuidPatch",
        new ApiException(400, "Missing the required parameter 'userUpdate' when calling usersUuidPatch"));
    }

    // create path and map variables
    String path = "/users/{uuid}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "uuid" + "\\}", apiInvoker.escapeString(uuid.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));

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
      apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((User) ApiInvoker.deserialize(localVarResponse,  "", User.class));
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
