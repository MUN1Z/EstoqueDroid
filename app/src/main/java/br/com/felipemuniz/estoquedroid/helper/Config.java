package br.com.felipemuniz.estoquedroid.helper;

/**
 * Config [HELPER]
 * Class responsible for HTTP requests
 * copyright (c) 2016, Felipe Muniz, EstoqueDroid
 */

public class Config {

    //Address of our scripts of the CRUD
    public static final String URL_REGISTER="http://estoquedroid.kingsdeveloping.com.br/_view/RegisterProduct.php";
    public static final String URL_GET_ALL = "http://estoquedroid.kingsdeveloping.com.br/_view/GetProducts.php";
    public static final String URL_GET_PRODUCT = "http://estoquedroid.kingsdeveloping.com.br/_view/GetProduct.php?id=";
    public static final String URL_UPDATE = "http://estoquedroid.kingsdeveloping.com.br/_view/UpdateProduct.php?id=";
    public static final String URL_DELETE = "http://estoquedroid.kingsdeveloping.com.br/_view/DeleteProduct.php?id=";

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
