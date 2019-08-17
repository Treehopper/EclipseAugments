package eu.hohenegger.gister.api;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.GenericType;

import eu.hohenegger.gister.impl.Pair;
import eu.hohenegger.gister.model.Gist;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-08-16T08:33:00.108Z[GMT]")public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * Create new Gist
   * @param body  (optional)
   * @return Gist
   * @throws ApiException if fails to make API call
   */
  public Gist create(Gist body) throws ApiException {
    Object localVarPostBody = body;
    // create path and map variables
    String localVarPath = "/gists";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerJwt" };

    GenericType<Gist> localVarReturnType = new GenericType<Gist>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Delete Gist
   * @param gistId Gist ID (required)
   * @throws ApiException if fails to make API call
   */
  public void delete(String gistId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'gistId' is set
    if (gistId == null) {
      throw new ApiException(400, "Missing the required parameter 'gistId' when calling delete");
    }
    // create path and map variables
    String localVarPath = "/gists/{gist_id}"
      .replaceAll("\\{" + "gist_id" + "\\}", apiClient.escapeString(gistId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerJwt" };

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * Lookup specific Gist
   * @param gistId Gist ID (required)
   * @return Gist
   * @throws ApiException if fails to make API call
   */
  public Gist find(String gistId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'gistId' is set
    if (gistId == null) {
      throw new ApiException(400, "Missing the required parameter 'gistId' when calling find");
    }
    // create path and map variables
    String localVarPath = "/gists/{gist_id}"
      .replaceAll("\\{" + "gist_id" + "\\}", apiClient.escapeString(gistId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerJwt" };

    GenericType<Gist> localVarReturnType = new GenericType<Gist>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * List all public Gists
   * @return List&lt;Gist&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Gist> findAll() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/gists/public";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Gist>> localVarReturnType = new GenericType<List<Gist>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * List public and optionally private Gists of specific user, depending on authentication.
   * @param username User ID (required)
   * @return List&lt;Gist&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Gist> findAllUser(String username) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling findAllUser");
    }
    // create path and map variables
    String localVarPath = "/users/{username}/gists"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "githubOAuth" };

    GenericType<List<Gist>> localVarReturnType = new GenericType<List<Gist>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Specific version of a Gist
   * @param gistId Gist ID (required)
   * @param sha SHA (required)
   * @return Gist
   * @throws ApiException if fails to make API call
   */
  public Gist findCommit(String gistId, String sha) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'gistId' is set
    if (gistId == null) {
      throw new ApiException(400, "Missing the required parameter 'gistId' when calling findCommit");
    }
    // verify the required parameter 'sha' is set
    if (sha == null) {
      throw new ApiException(400, "Missing the required parameter 'sha' when calling findCommit");
    }
    // create path and map variables
    String localVarPath = "/gists/{gist_id}/{sha}"
      .replaceAll("\\{" + "gist_id" + "\\}", apiClient.escapeString(gistId.toString()))
      .replaceAll("\\{" + "sha" + "\\}", apiClient.escapeString(sha.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerJwt" };

    GenericType<Gist> localVarReturnType = new GenericType<Gist>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * List all versions of Gist
   * @param gistId Gist ID (required)
   * @return List&lt;Gist&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Gist> findCommits(String gistId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'gistId' is set
    if (gistId == null) {
      throw new ApiException(400, "Missing the required parameter 'gistId' when calling findCommits");
    }
    // create path and map variables
    String localVarPath = "/gists/{gist_id}/commits"
      .replaceAll("\\{" + "gist_id" + "\\}", apiClient.escapeString(gistId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerJwt" };

    GenericType<List<Gist>> localVarReturnType = new GenericType<List<Gist>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Starred Gists of authenticated user
   * @param since  (optional)
   * @return List&lt;Gist&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Gist> findStarred(OffsetDateTime since) throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/gists/starred";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));



    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerJwt" };

    GenericType<List<Gist>> localVarReturnType = new GenericType<List<Gist>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Fork Gist
   * @param gistId Gist ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String fork(String gistId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'gistId' is set
    if (gistId == null) {
      throw new ApiException(400, "Missing the required parameter 'gistId' when calling fork");
    }
    // create path and map variables
    String localVarPath = "/gists/{gist_id}/forks"
      .replaceAll("\\{" + "gist_id" + "\\}", apiClient.escapeString(gistId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerJwt" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Check if Gist is starred
   * @param gistId Gist ID (required)
   * @throws ApiException if fails to make API call
   */
  public void isStarred(String gistId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'gistId' is set
    if (gistId == null) {
      throw new ApiException(400, "Missing the required parameter 'gistId' when calling isStarred");
    }
    // create path and map variables
    String localVarPath = "/gists/{gist_id}/star"
      .replaceAll("\\{" + "gist_id" + "\\}", apiClient.escapeString(gistId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerJwt" };

    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * List Gist forks
   * @param gistId Gist ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String listForks(String gistId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'gistId' is set
    if (gistId == null) {
      throw new ApiException(400, "Missing the required parameter 'gistId' when calling listForks");
    }
    // create path and map variables
    String localVarPath = "/gists/{gist_id}/forks"
      .replaceAll("\\{" + "gist_id" + "\\}", apiClient.escapeString(gistId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerJwt" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * 
   * Star Gist
   * @param gistId Gist ID (required)
   * @param contentLength  (optional)
   * @throws ApiException if fails to make API call
   */
  public void star(String gistId, Integer contentLength) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'gistId' is set
    if (gistId == null) {
      throw new ApiException(400, "Missing the required parameter 'gistId' when calling star");
    }
    // create path and map variables
    String localVarPath = "/gists/{gist_id}/star"
      .replaceAll("\\{" + "gist_id" + "\\}", apiClient.escapeString(gistId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (contentLength != null)
      localVarHeaderParams.put("Content-Length", apiClient.parameterToString(contentLength));


    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerJwt" };

    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * Unstar gist
   * @param gistId Gist ID (required)
   * @throws ApiException if fails to make API call
   */
  public void unstar(String gistId) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'gistId' is set
    if (gistId == null) {
      throw new ApiException(400, "Missing the required parameter 'gistId' when calling unstar");
    }
    // create path and map variables
    String localVarPath = "/gists/{gist_id}/star"
      .replaceAll("\\{" + "gist_id" + "\\}", apiClient.escapeString(gistId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerJwt" };

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * Update Gist. Files not mentioned remain untouched.
   * @param gistId Gist ID (required)
   * @param body  (optional)
   * @return Gist
   * @throws ApiException if fails to make API call
   */
  public Gist update(String gistId, Gist body) throws ApiException {
    Object localVarPostBody = body;
    // verify the required parameter 'gistId' is set
    if (gistId == null) {
      throw new ApiException(400, "Missing the required parameter 'gistId' when calling update");
    }
    // create path and map variables
    String localVarPath = "/gists/{gist_id}"
      .replaceAll("\\{" + "gist_id" + "\\}", apiClient.escapeString(gistId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();




    final String[] localVarAccepts = {
      "application/json; charset=utf-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerJwt" };

    GenericType<Gist> localVarReturnType = new GenericType<Gist>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
