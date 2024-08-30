<?php
/**
 * UiNodeScriptAttributes
 *
 * PHP version 7.4
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
 * The version of the OpenAPI document: v1.14.5
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.7.0
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
 * UiNodeScriptAttributes Class Doc Comment
 *
 * @category Class
 * @package  Ory\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class UiNodeScriptAttributes implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'uiNodeScriptAttributes';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'async' => 'bool',
        'crossorigin' => 'string',
        'id' => 'string',
        'integrity' => 'string',
        'nodeType' => 'string',
        'nonce' => 'string',
        'referrerpolicy' => 'string',
        'src' => 'string',
        'type' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'async' => null,
        'crossorigin' => null,
        'id' => null,
        'integrity' => null,
        'nodeType' => null,
        'nonce' => null,
        'referrerpolicy' => null,
        'src' => null,
        'type' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'async' => false,
        'crossorigin' => false,
        'id' => false,
        'integrity' => false,
        'nodeType' => false,
        'nonce' => false,
        'referrerpolicy' => false,
        'src' => false,
        'type' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

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
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'async' => 'async',
        'crossorigin' => 'crossorigin',
        'id' => 'id',
        'integrity' => 'integrity',
        'nodeType' => 'node_type',
        'nonce' => 'nonce',
        'referrerpolicy' => 'referrerpolicy',
        'src' => 'src',
        'type' => 'type'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'async' => 'setAsync',
        'crossorigin' => 'setCrossorigin',
        'id' => 'setId',
        'integrity' => 'setIntegrity',
        'nodeType' => 'setNodeType',
        'nonce' => 'setNonce',
        'referrerpolicy' => 'setReferrerpolicy',
        'src' => 'setSrc',
        'type' => 'setType'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'async' => 'getAsync',
        'crossorigin' => 'getCrossorigin',
        'id' => 'getId',
        'integrity' => 'getIntegrity',
        'nodeType' => 'getNodeType',
        'nonce' => 'getNonce',
        'referrerpolicy' => 'getReferrerpolicy',
        'src' => 'getSrc',
        'type' => 'getType'
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

    public const NODE_TYPE_TEXT = 'text';
    public const NODE_TYPE_INPUT = 'input';
    public const NODE_TYPE_IMG = 'img';
    public const NODE_TYPE_A = 'a';
    public const NODE_TYPE_SCRIPT = 'script';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getNodeTypeAllowableValues()
    {
        return [
            self::NODE_TYPE_TEXT,
            self::NODE_TYPE_INPUT,
            self::NODE_TYPE_IMG,
            self::NODE_TYPE_A,
            self::NODE_TYPE_SCRIPT,
        ];
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
        $this->setIfExists('async', $data ?? [], null);
        $this->setIfExists('crossorigin', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('integrity', $data ?? [], null);
        $this->setIfExists('nodeType', $data ?? [], null);
        $this->setIfExists('nonce', $data ?? [], null);
        $this->setIfExists('referrerpolicy', $data ?? [], null);
        $this->setIfExists('src', $data ?? [], null);
        $this->setIfExists('type', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['async'] === null) {
            $invalidProperties[] = "'async' can't be null";
        }
        if ($this->container['crossorigin'] === null) {
            $invalidProperties[] = "'crossorigin' can't be null";
        }
        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if ($this->container['integrity'] === null) {
            $invalidProperties[] = "'integrity' can't be null";
        }
        if ($this->container['nodeType'] === null) {
            $invalidProperties[] = "'nodeType' can't be null";
        }
        $allowedValues = $this->getNodeTypeAllowableValues();
        if (!is_null($this->container['nodeType']) && !in_array($this->container['nodeType'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'nodeType', must be one of '%s'",
                $this->container['nodeType'],
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['nonce'] === null) {
            $invalidProperties[] = "'nonce' can't be null";
        }
        if ($this->container['referrerpolicy'] === null) {
            $invalidProperties[] = "'referrerpolicy' can't be null";
        }
        if ($this->container['src'] === null) {
            $invalidProperties[] = "'src' can't be null";
        }
        if ($this->container['type'] === null) {
            $invalidProperties[] = "'type' can't be null";
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
     * Gets async
     *
     * @return bool
     */
    public function getAsync()
    {
        return $this->container['async'];
    }

    /**
     * Sets async
     *
     * @param bool $async The script async type
     *
     * @return self
     */
    public function setAsync($async)
    {
        if (is_null($async)) {
            throw new \InvalidArgumentException('non-nullable async cannot be null');
        }
        $this->container['async'] = $async;

        return $this;
    }

    /**
     * Gets crossorigin
     *
     * @return string
     */
    public function getCrossorigin()
    {
        return $this->container['crossorigin'];
    }

    /**
     * Sets crossorigin
     *
     * @param string $crossorigin The script cross origin policy
     *
     * @return self
     */
    public function setCrossorigin($crossorigin)
    {
        if (is_null($crossorigin)) {
            throw new \InvalidArgumentException('non-nullable crossorigin cannot be null');
        }
        $this->container['crossorigin'] = $crossorigin;

        return $this;
    }

    /**
     * Gets id
     *
     * @return string
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param string $id A unique identifier
     *
     * @return self
     */
    public function setId($id)
    {
        if (is_null($id)) {
            throw new \InvalidArgumentException('non-nullable id cannot be null');
        }
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets integrity
     *
     * @return string
     */
    public function getIntegrity()
    {
        return $this->container['integrity'];
    }

    /**
     * Sets integrity
     *
     * @param string $integrity The script's integrity hash
     *
     * @return self
     */
    public function setIntegrity($integrity)
    {
        if (is_null($integrity)) {
            throw new \InvalidArgumentException('non-nullable integrity cannot be null');
        }
        $this->container['integrity'] = $integrity;

        return $this;
    }

    /**
     * Gets nodeType
     *
     * @return string
     */
    public function getNodeType()
    {
        return $this->container['nodeType'];
    }

    /**
     * Sets nodeType
     *
     * @param string $nodeType NodeType represents this node's types. It is a mirror of `node.type` and is primarily used to allow compatibility with OpenAPI 3.0. In this struct it technically always is \"script\". text Text input Input img Image a Anchor script Script
     *
     * @return self
     */
    public function setNodeType($nodeType)
    {
        if (is_null($nodeType)) {
            throw new \InvalidArgumentException('non-nullable nodeType cannot be null');
        }
        $allowedValues = $this->getNodeTypeAllowableValues();
        if (!in_array($nodeType, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'nodeType', must be one of '%s'",
                    $nodeType,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['nodeType'] = $nodeType;

        return $this;
    }

    /**
     * Gets nonce
     *
     * @return string
     */
    public function getNonce()
    {
        return $this->container['nonce'];
    }

    /**
     * Sets nonce
     *
     * @param string $nonce Nonce for CSP  A nonce you may want to use to improve your Content Security Policy. You do not have to use this value but if you want to improve your CSP policies you may use it. You can also choose to use your own nonce value!
     *
     * @return self
     */
    public function setNonce($nonce)
    {
        if (is_null($nonce)) {
            throw new \InvalidArgumentException('non-nullable nonce cannot be null');
        }
        $this->container['nonce'] = $nonce;

        return $this;
    }

    /**
     * Gets referrerpolicy
     *
     * @return string
     */
    public function getReferrerpolicy()
    {
        return $this->container['referrerpolicy'];
    }

    /**
     * Sets referrerpolicy
     *
     * @param string $referrerpolicy The script referrer policy
     *
     * @return self
     */
    public function setReferrerpolicy($referrerpolicy)
    {
        if (is_null($referrerpolicy)) {
            throw new \InvalidArgumentException('non-nullable referrerpolicy cannot be null');
        }
        $this->container['referrerpolicy'] = $referrerpolicy;

        return $this;
    }

    /**
     * Gets src
     *
     * @return string
     */
    public function getSrc()
    {
        return $this->container['src'];
    }

    /**
     * Sets src
     *
     * @param string $src The script source
     *
     * @return self
     */
    public function setSrc($src)
    {
        if (is_null($src)) {
            throw new \InvalidArgumentException('non-nullable src cannot be null');
        }
        $this->container['src'] = $src;

        return $this;
    }

    /**
     * Gets type
     *
     * @return string
     */
    public function getType()
    {
        return $this->container['type'];
    }

    /**
     * Sets type
     *
     * @param string $type The script MIME type
     *
     * @return self
     */
    public function setType($type)
    {
        if (is_null($type)) {
            throw new \InvalidArgumentException('non-nullable type cannot be null');
        }
        $this->container['type'] = $type;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
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
    #[\ReturnTypeWillChange]
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
    public function offsetSet($offset, $value): void
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
    public function offsetUnset($offset): void
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
    #[\ReturnTypeWillChange]
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


