package br.com.felipemuniz.estoquedroid.helper;

/**
 * Config [HELPER]
 * Class responsible for HTTP requests
 * copyright (c) 2016, Felipe Muniz, EstoqueDroid
 */

public class Config {

    //Address of our scripts of the CRUD
    public static final String URL_REGISTER="http://estoquedroid.kingsdeveloping.com.br/_view/RegisterProduct.php";
    public static final String URL_GET_ALL = "http://estoquedroid.kingsdeveloping.com.br/_view/getProducts.php";
    public static final String URL_VIEW_PRODUCT = "";
    public static final String URL_UPDATE = "";
    public static final String URL_DELETE = "";

    //Keys that will be used to send the request to php scripts
    public static final String KEY_ID = "id";
    public static final String KEY_NAME = "name";
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_PRICE = "price";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="produto";
    public static final String TAG_ID = "id";
    public static final String TAG_NAME = "name";
    public static final String TAG_DESCRIPTION = "description";
    public static final String TAG_PRICE = "price";

    //id to pass with intent
    public static final String EMP_ID = "emp_id";
}
