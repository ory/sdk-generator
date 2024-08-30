<?php
/**
 * UpdateRegistrationFlowBody
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
 * UpdateRegistrationFlowBody Class Doc Comment
 *
 * @category Class
 * @description Update Registration Request Body
 * @package  Ory\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class UpdateRegistrationFlowBody implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = 'method';

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'updateRegistrationFlowBody';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'csrfToken' => 'string',
        'method' => 'string',
        'password' => 'string',
        'traits' => 'object',
        'transientPayload' => 'object',
        'idToken' => 'string',
        'idTokenNonce' => 'string',
        'provider' => 'string',
        'upstreamParameters' => 'object',
        'webauthnRegister' => 'string',
        'webauthnRegisterDisplayname' => 'string',
        'code' => 'string',
        'resend' => 'string',
        'passkeyRegister' => 'string',
        'screen' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'csrfToken' => null,
        'method' => null,
        'password' => null,
        'traits' => null,
        'transientPayload' => null,
        'idToken' => null,
        'idTokenNonce' => null,
        'provider' => null,
        'upstreamParameters' => null,
        'webauthnRegister' => null,
        'webauthnRegisterDisplayname' => null,
        'code' => null,
        'resend' => null,
        'passkeyRegister' => null,
        'screen' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'csrfToken' => false,
        'method' => false,
        'password' => false,
        'traits' => false,
        'transientPayload' => false,
        'idToken' => false,
        'idTokenNonce' => false,
        'provider' => false,
        'upstreamParameters' => false,
        'webauthnRegister' => false,
        'webauthnRegisterDisplayname' => false,
        'code' => false,
        'resend' => false,
        'passkeyRegister' => false,
        'screen' => false
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
        'csrfToken' => 'csrf_token',
        'method' => 'method',
        'password' => 'password',
        'traits' => 'traits',
        'transientPayload' => 'transient_payload',
        'idToken' => 'id_token',
        'idTokenNonce' => 'id_token_nonce',
        'provider' => 'provider',
        'upstreamParameters' => 'upstream_parameters',
        'webauthnRegister' => 'webauthn_register',
        'webauthnRegisterDisplayname' => 'webauthn_register_displayname',
        'code' => 'code',
        'resend' => 'resend',
        'passkeyRegister' => 'passkey_register',
        'screen' => 'screen'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'csrfToken' => 'setCsrfToken',
        'method' => 'setMethod',
        'password' => 'setPassword',
        'traits' => 'setTraits',
        'transientPayload' => 'setTransientPayload',
        'idToken' => 'setIdToken',
        'idTokenNonce' => 'setIdTokenNonce',
        'provider' => 'setProvider',
        'upstreamParameters' => 'setUpstreamParameters',
        'webauthnRegister' => 'setWebauthnRegister',
        'webauthnRegisterDisplayname' => 'setWebauthnRegisterDisplayname',
        'code' => 'setCode',
        'resend' => 'setResend',
        'passkeyRegister' => 'setPasskeyRegister',
        'screen' => 'setScreen'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'csrfToken' => 'getCsrfToken',
        'method' => 'getMethod',
        'password' => 'getPassword',
        'traits' => 'getTraits',
        'transientPayload' => 'getTransientPayload',
        'idToken' => 'getIdToken',
        'idTokenNonce' => 'getIdTokenNonce',
        'provider' => 'getProvider',
        'upstreamParameters' => 'getUpstreamParameters',
        'webauthnRegister' => 'getWebauthnRegister',
        'webauthnRegisterDisplayname' => 'getWebauthnRegisterDisplayname',
        'code' => 'getCode',
        'resend' => 'getResend',
        'passkeyRegister' => 'getPasskeyRegister',
        'screen' => 'getScreen'
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
        $this->setIfExists('csrfToken', $data ?? [], null);
        $this->setIfExists('method', $data ?? [], null);
        $this->setIfExists('password', $data ?? [], null);
        $this->setIfExists('traits', $data ?? [], null);
        $this->setIfExists('transientPayload', $data ?? [], null);
        $this->setIfExists('idToken', $data ?? [], null);
        $this->setIfExists('idTokenNonce', $data ?? [], null);
        $this->setIfExists('provider', $data ?? [], null);
        $this->setIfExists('upstreamParameters', $data ?? [], null);
        $this->setIfExists('webauthnRegister', $data ?? [], null);
        $this->setIfExists('webauthnRegisterDisplayname', $data ?? [], null);
        $this->setIfExists('code', $data ?? [], null);
        $this->setIfExists('resend', $data ?? [], null);
        $this->setIfExists('passkeyRegister', $data ?? [], null);
        $this->setIfExists('screen', $data ?? [], null);

        // Initialize discriminator property with the model name.
        $this->container['method'] = static::$openAPIModelName;
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

        if ($this->container['method'] === null) {
            $invalidProperties[] = "'method' can't be null";
        }
        if ($this->container['password'] === null) {
            $invalidProperties[] = "'password' can't be null";
        }
        if ($this->container['traits'] === null) {
            $invalidProperties[] = "'traits' can't be null";
        }
        if ($this->container['provider'] === null) {
            $invalidProperties[] = "'provider' can't be null";
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
     * Gets csrfToken
     *
     * @return string|null
     */
    public function getCsrfToken()
    {
        return $this->container['csrfToken'];
    }

    /**
     * Sets csrfToken
     *
     * @param string|null $csrfToken The Anti-CSRF Token  This token is only required when performing browser flows.
     *
     * @return self
     */
    public function setCsrfToken($csrfToken)
    {
        if (is_null($csrfToken)) {
            throw new \InvalidArgumentException('non-nullable csrfToken cannot be null');
        }
        $this->container['csrfToken'] = $csrfToken;

        return $this;
    }

    /**
     * Gets method
     *
     * @return string
     */
    public function getMethod()
    {
        return $this->container['method'];
    }

    /**
     * Sets method
     *
     * @param string $method Method  Should be set to profile when trying to update a profile.
     *
     * @return self
     */
    public function setMethod($method)
    {
        if (is_null($method)) {
            throw new \InvalidArgumentException('non-nullable method cannot be null');
        }
        $this->container['method'] = $method;

        return $this;
    }

    /**
     * Gets password
     *
     * @return string
     */
    public function getPassword()
    {
        return $this->container['password'];
    }

    /**
     * Sets password
     *
     * @param string $password Password to sign the user up with
     *
     * @return self
     */
    public function setPassword($password)
    {
        if (is_null($password)) {
            throw new \InvalidArgumentException('non-nullable password cannot be null');
        }
        $this->container['password'] = $password;

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
     * @param object $traits Traits  The identity's traits.
     *
     * @return self
     */
    public function setTraits($traits)
    {
        if (is_null($traits)) {
            throw new \InvalidArgumentException('non-nullable traits cannot be null');
        }
        $this->container['traits'] = $traits;

        return $this;
    }

    /**
     * Gets transientPayload
     *
     * @return object|null
     */
    public function getTransientPayload()
    {
        return $this->container['transientPayload'];
    }

    /**
     * Sets transientPayload
     *
     * @param object|null $transientPayload Transient data to pass along to any webhooks
     *
     * @return self
     */
    public function setTransientPayload($transientPayload)
    {
        if (is_null($transientPayload)) {
            throw new \InvalidArgumentException('non-nullable transientPayload cannot be null');
        }
        $this->container['transientPayload'] = $transientPayload;

        return $this;
    }

    /**
     * Gets idToken
     *
     * @return string|null
     */
    public function getIdToken()
    {
        return $this->container['idToken'];
    }

    /**
     * Sets idToken
     *
     * @param string|null $idToken IDToken is an optional id token provided by an OIDC provider  If submitted, it is verified using the OIDC provider's public key set and the claims are used to populate the OIDC credentials of the identity. If the OIDC provider does not store additional claims (such as name, etc.) in the IDToken itself, you can use the `traits` field to populate the identity's traits. Note, that Apple only includes the users email in the IDToken.  Supported providers are Apple Google
     *
     * @return self
     */
    public function setIdToken($idToken)
    {
        if (is_null($idToken)) {
            throw new \InvalidArgumentException('non-nullable idToken cannot be null');
        }
        $this->container['idToken'] = $idToken;

        return $this;
    }

    /**
     * Gets idTokenNonce
     *
     * @return string|null
     */
    public function getIdTokenNonce()
    {
        return $this->container['idTokenNonce'];
    }

    /**
     * Sets idTokenNonce
     *
     * @param string|null $idTokenNonce IDTokenNonce is the nonce, used when generating the IDToken. If the provider supports nonce validation, the nonce will be validated against this value and is required.
     *
     * @return self
     */
    public function setIdTokenNonce($idTokenNonce)
    {
        if (is_null($idTokenNonce)) {
            throw new \InvalidArgumentException('non-nullable idTokenNonce cannot be null');
        }
        $this->container['idTokenNonce'] = $idTokenNonce;

        return $this;
    }

    /**
     * Gets provider
     *
     * @return string
     */
    public function getProvider()
    {
        return $this->container['provider'];
    }

    /**
     * Sets provider
     *
     * @param string $provider The provider to register with
     *
     * @return self
     */
    public function setProvider($provider)
    {
        if (is_null($provider)) {
            throw new \InvalidArgumentException('non-nullable provider cannot be null');
        }
        $this->container['provider'] = $provider;

        return $this;
    }

    /**
     * Gets upstreamParameters
     *
     * @return object|null
     */
    public function getUpstreamParameters()
    {
        return $this->container['upstreamParameters'];
    }

    /**
     * Sets upstreamParameters
     *
     * @param object|null $upstreamParameters UpstreamParameters are the parameters that are passed to the upstream identity provider.  These parameters are optional and depend on what the upstream identity provider supports. Supported parameters are: `login_hint` (string): The `login_hint` parameter suppresses the account chooser and either pre-fills the email box on the sign-in form, or selects the proper session. `hd` (string): The `hd` parameter limits the login/registration process to a Google Organization, e.g. `mycollege.edu`. `prompt` (string): The `prompt` specifies whether the Authorization Server prompts the End-User for reauthentication and consent, e.g. `select_account`.
     *
     * @return self
     */
    public function setUpstreamParameters($upstreamParameters)
    {
        if (is_null($upstreamParameters)) {
            throw new \InvalidArgumentException('non-nullable upstreamParameters cannot be null');
        }
        $this->container['upstreamParameters'] = $upstreamParameters;

        return $this;
    }

    /**
     * Gets webauthnRegister
     *
     * @return string|null
     */
    public function getWebauthnRegister()
    {
        return $this->container['webauthnRegister'];
    }

    /**
     * Sets webauthnRegister
     *
     * @param string|null $webauthnRegister Register a WebAuthn Security Key  It is expected that the JSON returned by the WebAuthn registration process is included here.
     *
     * @return self
     */
    public function setWebauthnRegister($webauthnRegister)
    {
        if (is_null($webauthnRegister)) {
            throw new \InvalidArgumentException('non-nullable webauthnRegister cannot be null');
        }
        $this->container['webauthnRegister'] = $webauthnRegister;

        return $this;
    }

    /**
     * Gets webauthnRegisterDisplayname
     *
     * @return string|null
     */
    public function getWebauthnRegisterDisplayname()
    {
        return $this->container['webauthnRegisterDisplayname'];
    }

    /**
     * Sets webauthnRegisterDisplayname
     *
     * @param string|null $webauthnRegisterDisplayname Name of the WebAuthn Security Key to be Added  A human-readable name for the security key which will be added.
     *
     * @return self
     */
    public function setWebauthnRegisterDisplayname($webauthnRegisterDisplayname)
    {
        if (is_null($webauthnRegisterDisplayname)) {
            throw new \InvalidArgumentException('non-nullable webauthnRegisterDisplayname cannot be null');
        }
        $this->container['webauthnRegisterDisplayname'] = $webauthnRegisterDisplayname;

        return $this;
    }

    /**
     * Gets code
     *
     * @return string|null
     */
    public function getCode()
    {
        return $this->container['code'];
    }

    /**
     * Sets code
     *
     * @param string|null $code The OTP Code sent to the user
     *
     * @return self
     */
    public function setCode($code)
    {
        if (is_null($code)) {
            throw new \InvalidArgumentException('non-nullable code cannot be null');
        }
        $this->container['code'] = $code;

        return $this;
    }

    /**
     * Gets resend
     *
     * @return string|null
     */
    public function getResend()
    {
        return $this->container['resend'];
    }

    /**
     * Sets resend
     *
     * @param string|null $resend Resend restarts the flow with a new code
     *
     * @return self
     */
    public function setResend($resend)
    {
        if (is_null($resend)) {
            throw new \InvalidArgumentException('non-nullable resend cannot be null');
        }
        $this->container['resend'] = $resend;

        return $this;
    }

    /**
     * Gets passkeyRegister
     *
     * @return string|null
     */
    public function getPasskeyRegister()
    {
        return $this->container['passkeyRegister'];
    }

    /**
     * Sets passkeyRegister
     *
     * @param string|null $passkeyRegister Register a WebAuthn Security Key  It is expected that the JSON returned by the WebAuthn registration process is included here.
     *
     * @return self
     */
    public function setPasskeyRegister($passkeyRegister)
    {
        if (is_null($passkeyRegister)) {
            throw new \InvalidArgumentException('non-nullable passkeyRegister cannot be null');
        }
        $this->container['passkeyRegister'] = $passkeyRegister;

        return $this;
    }

    /**
     * Gets screen
     *
     * @return string|null
     */
    public function getScreen()
    {
        return $this->container['screen'];
    }

    /**
     * Sets screen
     *
     * @param string|null $screen Screen requests navigation to a previous screen.  This must be set to credential-selection to go back to the credential selection screen.
     *
     * @return self
     */
    public function setScreen($screen)
    {
        if (is_null($screen)) {
            throw new \InvalidArgumentException('non-nullable screen cannot be null');
        }
        $this->container['screen'] = $screen;

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


