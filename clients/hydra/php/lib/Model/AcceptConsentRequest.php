<?php
/**
 * AcceptConsentRequest
 *
 * PHP version 5
 *
 * @category Class
 * @package  Ory\Hydra\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * ORY Hydra
 *
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.i+1
 * 
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 4.2.2
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace Ory\Hydra\Client\Model;

use \ArrayAccess;
use \Ory\Hydra\Client\ObjectSerializer;

/**
 * AcceptConsentRequest Class Doc Comment
 *
 * @category Class
 * @package  Ory\Hydra\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class AcceptConsentRequest implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'acceptConsentRequest';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'grantAccessTokenAudience' => 'string[]',
        'grantScope' => 'string[]',
        'remember' => 'bool',
        'rememberFor' => 'int',
        'session' => '\Ory\Hydra\Client\Model\ConsentRequestSession'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'grantAccessTokenAudience' => null,
        'grantScope' => null,
        'remember' => null,
        'rememberFor' => 'int64',
        'session' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'grantAccessTokenAudience' => 'grant_access_token_audience',
        'grantScope' => 'grant_scope',
        'remember' => 'remember',
        'rememberFor' => 'remember_for',
        'session' => 'session'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'grantAccessTokenAudience' => 'setGrantAccessTokenAudience',
        'grantScope' => 'setGrantScope',
        'remember' => 'setRemember',
        'rememberFor' => 'setRememberFor',
        'session' => 'setSession'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'grantAccessTokenAudience' => 'getGrantAccessTokenAudience',
        'grantScope' => 'getGrantScope',
        'remember' => 'getRemember',
        'rememberFor' => 'getRememberFor',
        'session' => 'getSession'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['grantAccessTokenAudience'] = isset($data['grantAccessTokenAudience']) ? $data['grantAccessTokenAudience'] : null;
        $this->container['grantScope'] = isset($data['grantScope']) ? $data['grantScope'] : null;
        $this->container['remember'] = isset($data['remember']) ? $data['remember'] : null;
        $this->container['rememberFor'] = isset($data['rememberFor']) ? $data['rememberFor'] : null;
        $this->container['session'] = isset($data['session']) ? $data['session'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets grantAccessTokenAudience
     *
     * @return string[]|null
     */
    public function getGrantAccessTokenAudience()
    {
        return $this->container['grantAccessTokenAudience'];
    }

    /**
     * Sets grantAccessTokenAudience
     *
     * @param string[]|null $grantAccessTokenAudience GrantedAudience sets the audience the user authorized the client to use. Should be a subset of `requested_access_token_audience`.
     *
     * @return $this
     */
    public function setGrantAccessTokenAudience($grantAccessTokenAudience)
    {
        $this->container['grantAccessTokenAudience'] = $grantAccessTokenAudience;

        return $this;
    }

    /**
     * Gets grantScope
     *
     * @return string[]|null
     */
    public function getGrantScope()
    {
        return $this->container['grantScope'];
    }

    /**
     * Sets grantScope
     *
     * @param string[]|null $grantScope GrantScope sets the scope the user authorized the client to use. Should be a subset of `requested_scope`.
     *
     * @return $this
     */
    public function setGrantScope($grantScope)
    {
        $this->container['grantScope'] = $grantScope;

        return $this;
    }

    /**
     * Gets remember
     *
     * @return bool|null
     */
    public function getRemember()
    {
        return $this->container['remember'];
    }

    /**
     * Sets remember
     *
     * @param bool|null $remember Remember, if set to true, tells ORY Hydra to remember this consent authorization and reuse it if the same client asks the same user for the same, or a subset of, scope.
     *
     * @return $this
     */
    public function setRemember($remember)
    {
        $this->container['remember'] = $remember;

        return $this;
    }

    /**
     * Gets rememberFor
     *
     * @return int|null
     */
    public function getRememberFor()
    {
        return $this->container['rememberFor'];
    }

    /**
     * Sets rememberFor
     *
     * @param int|null $rememberFor RememberFor sets how long the consent authorization should be remembered for in seconds. If set to `0`, the authorization will be remembered indefinitely.
     *
     * @return $this
     */
    public function setRememberFor($rememberFor)
    {
        $this->container['rememberFor'] = $rememberFor;

        return $this;
    }

    /**
     * Gets session
     *
     * @return \Ory\Hydra\Client\Model\ConsentRequestSession|null
     */
    public function getSession()
    {
        return $this->container['session'];
    }

    /**
     * Sets session
     *
     * @param \Ory\Hydra\Client\Model\ConsentRequestSession|null $session session
     *
     * @return $this
     */
    public function setSession($session)
    {
        $this->container['session'] = $session;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


