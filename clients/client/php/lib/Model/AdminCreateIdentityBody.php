<?php
/**
 * AdminCreateIdentityBody
 *
 * PHP version 7.3
 *
 * @category Class
 * @package  Ory\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.
 *
 * The version of the OpenAPI document: v0.0.1-alpha.169
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 5.4.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace Ory\Client\Model;

use \ArrayAccess;
use \Ory\Client\ObjectSerializer;

/**
 * AdminCreateIdentityBody Class Doc Comment
 *
 * @category Class
 * @package  Ory\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<TKey, TValue>
 * @template TKey int|null
 * @template TValue mixed|null
 */
class AdminCreateIdentityBody implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'adminCreateIdentityBody';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'credentials' => '\Ory\Client\Model\AdminIdentityImportCredentials',
        'recoveryAddresses' => '\Ory\Client\Model\RecoveryAddress[]',
        'schemaId' => 'string',
        'state' => '\Ory\Client\Model\IdentityState',
        'traits' => 'object',
        'verifiableAddresses' => '\Ory\Client\Model\VerifiableIdentityAddress[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'credentials' => null,
        'recoveryAddresses' => null,
        'schemaId' => null,
        'state' => null,
        'traits' => null,
        'verifiableAddresses' => null
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
        'credentials' => 'credentials',
        'recoveryAddresses' => 'recovery_addresses',
        'schemaId' => 'schema_id',
        'state' => 'state',
        'traits' => 'traits',
        'verifiableAddresses' => 'verifiable_addresses'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'credentials' => 'setCredentials',
        'recoveryAddresses' => 'setRecoveryAddresses',
        'schemaId' => 'setSchemaId',
        'state' => 'setState',
        'traits' => 'setTraits',
        'verifiableAddresses' => 'setVerifiableAddresses'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'credentials' => 'getCredentials',
        'recoveryAddresses' => 'getRecoveryAddresses',
        'schemaId' => 'getSchemaId',
        'state' => 'getState',
        'traits' => 'getTraits',
        'verifiableAddresses' => 'getVerifiableAddresses'
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
        $this->container['credentials'] = $data['credentials'] ?? null;
        $this->container['recoveryAddresses'] = $data['recoveryAddresses'] ?? null;
        $this->container['schemaId'] = $data['schemaId'] ?? null;
        $this->container['state'] = $data['state'] ?? null;
        $this->container['traits'] = $data['traits'] ?? null;
        $this->container['verifiableAddresses'] = $data['verifiableAddresses'] ?? null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['schemaId'] === null) {
            $invalidProperties[] = "'schemaId' can't be null";
        }
        if ($this->container['traits'] === null) {
            $invalidProperties[] = "'traits' can't be null";
        }
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
     * Gets credentials
     *
     * @return \Ory\Client\Model\AdminIdentityImportCredentials|null
     */
    public function getCredentials()
    {
        return $this->container['credentials'];
    }

    /**
     * Sets credentials
     *
     * @param \Ory\Client\Model\AdminIdentityImportCredentials|null $credentials credentials
     *
     * @return self
     */
    public function setCredentials($credentials)
    {
        $this->container['credentials'] = $credentials;

        return $this;
    }

    /**
     * Gets recoveryAddresses
     *
     * @return \Ory\Client\Model\RecoveryAddress[]|null
     */
    public function getRecoveryAddresses()
    {
        return $this->container['recoveryAddresses'];
    }

    /**
     * Sets recoveryAddresses
     *
     * @param \Ory\Client\Model\RecoveryAddress[]|null $recoveryAddresses RecoveryAddresses contains all the addresses that can be used to recover an identity.  Use this structure to import recovery addresses for an identity. Please keep in mind that the address needs to be represented in the Identity Schema or this field will be overwritten on the next identity update.
     *
     * @return self
     */
    public function setRecoveryAddresses($recoveryAddresses)
    {
        $this->container['recoveryAddresses'] = $recoveryAddresses;

        return $this;
    }

    /**
     * Gets schemaId
     *
     * @return string
     */
    public function getSchemaId()
    {
        return $this->container['schemaId'];
    }

    /**
     * Sets schemaId
     *
     * @param string $schemaId SchemaID is the ID of the JSON Schema to be used for validating the identity's traits.
     *
     * @return self
     */
    public function setSchemaId($schemaId)
    {
        $this->container['schemaId'] = $schemaId;

        return $this;
    }

    /**
     * Gets state
     *
     * @return \Ory\Client\Model\IdentityState|null
     */
    public function getState()
    {
        return $this->container['state'];
    }

    /**
     * Sets state
     *
     * @param \Ory\Client\Model\IdentityState|null $state state
     *
     * @return self
     */
    public function setState($state)
    {
        $this->container['state'] = $state;

        return $this;
    }

    /**
     * Gets traits
     *
     * @return object
     */
    public function getTraits()
    {
        return $this->container['traits'];
    }

    /**
     * Sets traits
     *
     * @param object $traits Traits represent an identity's traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in `schema_url`.
     *
     * @return self
     */
    public function setTraits($traits)
    {
        $this->container['traits'] = $traits;

        return $this;
    }

    /**
     * Gets verifiableAddresses
     *
     * @return \Ory\Client\Model\VerifiableIdentityAddress[]|null
     */
    public function getVerifiableAddresses()
    {
        return $this->container['verifiableAddresses'];
    }

    /**
     * Sets verifiableAddresses
     *
     * @param \Ory\Client\Model\VerifiableIdentityAddress[]|null $verifiableAddresses VerifiableAddresses contains all the addresses that can be verified by the user.  Use this structure to import verified addresses for an identity. Please keep in mind that the address needs to be represented in the Identity Schema or this field will be overwritten on the next identity update.
     *
     * @return self
     */
    public function setVerifiableAddresses($verifiableAddresses)
    {
        $this->container['verifiableAddresses'] = $verifiableAddresses;

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
     * @return mixed|null
     */
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
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
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
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


