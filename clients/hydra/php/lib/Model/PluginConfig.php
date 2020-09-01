<?php
/**
 * PluginConfig
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
 * The version of the OpenAPI document: v1.7.4
 * 
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 4.3.1
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
 * PluginConfig Class Doc Comment
 *
 * @category Class
 * @package  Ory\Hydra\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class PluginConfig implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'PluginConfig';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'args' => '\Ory\Hydra\Client\Model\PluginConfigArgs',
        'description' => 'string',
        'dockerVersion' => 'string',
        'documentation' => 'string',
        'entrypoint' => 'string[]',
        'env' => '\Ory\Hydra\Client\Model\PluginEnv[]',
        'interface' => '\Ory\Hydra\Client\Model\PluginConfigInterface',
        'ipcHost' => 'bool',
        'linux' => '\Ory\Hydra\Client\Model\PluginConfigLinux',
        'mounts' => '\Ory\Hydra\Client\Model\PluginMount[]',
        'network' => '\Ory\Hydra\Client\Model\PluginConfigNetwork',
        'pidHost' => 'bool',
        'propagatedMount' => 'string',
        'user' => '\Ory\Hydra\Client\Model\PluginConfigUser',
        'workDir' => 'string',
        'rootfs' => '\Ory\Hydra\Client\Model\PluginConfigRootfs'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'args' => null,
        'description' => null,
        'dockerVersion' => null,
        'documentation' => null,
        'entrypoint' => null,
        'env' => null,
        'interface' => null,
        'ipcHost' => null,
        'linux' => null,
        'mounts' => null,
        'network' => null,
        'pidHost' => null,
        'propagatedMount' => null,
        'user' => null,
        'workDir' => null,
        'rootfs' => null
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
        'args' => 'Args',
        'description' => 'Description',
        'dockerVersion' => 'DockerVersion',
        'documentation' => 'Documentation',
        'entrypoint' => 'Entrypoint',
        'env' => 'Env',
        'interface' => 'Interface',
        'ipcHost' => 'IpcHost',
        'linux' => 'Linux',
        'mounts' => 'Mounts',
        'network' => 'Network',
        'pidHost' => 'PidHost',
        'propagatedMount' => 'PropagatedMount',
        'user' => 'User',
        'workDir' => 'WorkDir',
        'rootfs' => 'rootfs'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'args' => 'setArgs',
        'description' => 'setDescription',
        'dockerVersion' => 'setDockerVersion',
        'documentation' => 'setDocumentation',
        'entrypoint' => 'setEntrypoint',
        'env' => 'setEnv',
        'interface' => 'setInterface',
        'ipcHost' => 'setIpcHost',
        'linux' => 'setLinux',
        'mounts' => 'setMounts',
        'network' => 'setNetwork',
        'pidHost' => 'setPidHost',
        'propagatedMount' => 'setPropagatedMount',
        'user' => 'setUser',
        'workDir' => 'setWorkDir',
        'rootfs' => 'setRootfs'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'args' => 'getArgs',
        'description' => 'getDescription',
        'dockerVersion' => 'getDockerVersion',
        'documentation' => 'getDocumentation',
        'entrypoint' => 'getEntrypoint',
        'env' => 'getEnv',
        'interface' => 'getInterface',
        'ipcHost' => 'getIpcHost',
        'linux' => 'getLinux',
        'mounts' => 'getMounts',
        'network' => 'getNetwork',
        'pidHost' => 'getPidHost',
        'propagatedMount' => 'getPropagatedMount',
        'user' => 'getUser',
        'workDir' => 'getWorkDir',
        'rootfs' => 'getRootfs'
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
        $this->container['args'] = isset($data['args']) ? $data['args'] : null;
        $this->container['description'] = isset($data['description']) ? $data['description'] : null;
        $this->container['dockerVersion'] = isset($data['dockerVersion']) ? $data['dockerVersion'] : null;
        $this->container['documentation'] = isset($data['documentation']) ? $data['documentation'] : null;
        $this->container['entrypoint'] = isset($data['entrypoint']) ? $data['entrypoint'] : null;
        $this->container['env'] = isset($data['env']) ? $data['env'] : null;
        $this->container['interface'] = isset($data['interface']) ? $data['interface'] : null;
        $this->container['ipcHost'] = isset($data['ipcHost']) ? $data['ipcHost'] : null;
        $this->container['linux'] = isset($data['linux']) ? $data['linux'] : null;
        $this->container['mounts'] = isset($data['mounts']) ? $data['mounts'] : null;
        $this->container['network'] = isset($data['network']) ? $data['network'] : null;
        $this->container['pidHost'] = isset($data['pidHost']) ? $data['pidHost'] : null;
        $this->container['propagatedMount'] = isset($data['propagatedMount']) ? $data['propagatedMount'] : null;
        $this->container['user'] = isset($data['user']) ? $data['user'] : null;
        $this->container['workDir'] = isset($data['workDir']) ? $data['workDir'] : null;
        $this->container['rootfs'] = isset($data['rootfs']) ? $data['rootfs'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['args'] === null) {
            $invalidProperties[] = "'args' can't be null";
        }
        if ($this->container['description'] === null) {
            $invalidProperties[] = "'description' can't be null";
        }
        if ($this->container['documentation'] === null) {
            $invalidProperties[] = "'documentation' can't be null";
        }
        if ($this->container['entrypoint'] === null) {
            $invalidProperties[] = "'entrypoint' can't be null";
        }
        if ($this->container['env'] === null) {
            $invalidProperties[] = "'env' can't be null";
        }
        if ($this->container['interface'] === null) {
            $invalidProperties[] = "'interface' can't be null";
        }
        if ($this->container['ipcHost'] === null) {
            $invalidProperties[] = "'ipcHost' can't be null";
        }
        if ($this->container['linux'] === null) {
            $invalidProperties[] = "'linux' can't be null";
        }
        if ($this->container['mounts'] === null) {
            $invalidProperties[] = "'mounts' can't be null";
        }
        if ($this->container['network'] === null) {
            $invalidProperties[] = "'network' can't be null";
        }
        if ($this->container['pidHost'] === null) {
            $invalidProperties[] = "'pidHost' can't be null";
        }
        if ($this->container['propagatedMount'] === null) {
            $invalidProperties[] = "'propagatedMount' can't be null";
        }
        if ($this->container['workDir'] === null) {
            $invalidProperties[] = "'workDir' can't be null";
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
     * Gets args
     *
     * @return \Ory\Hydra\Client\Model\PluginConfigArgs
     */
    public function getArgs()
    {
        return $this->container['args'];
    }

    /**
     * Sets args
     *
     * @param \Ory\Hydra\Client\Model\PluginConfigArgs $args args
     *
     * @return $this
     */
    public function setArgs($args)
    {
        $this->container['args'] = $args;

        return $this;
    }

    /**
     * Gets description
     *
     * @return string
     */
    public function getDescription()
    {
        return $this->container['description'];
    }

    /**
     * Sets description
     *
     * @param string $description description
     *
     * @return $this
     */
    public function setDescription($description)
    {
        $this->container['description'] = $description;

        return $this;
    }

    /**
     * Gets dockerVersion
     *
     * @return string|null
     */
    public function getDockerVersion()
    {
        return $this->container['dockerVersion'];
    }

    /**
     * Sets dockerVersion
     *
     * @param string|null $dockerVersion Docker Version used to create the plugin
     *
     * @return $this
     */
    public function setDockerVersion($dockerVersion)
    {
        $this->container['dockerVersion'] = $dockerVersion;

        return $this;
    }

    /**
     * Gets documentation
     *
     * @return string
     */
    public function getDocumentation()
    {
        return $this->container['documentation'];
    }

    /**
     * Sets documentation
     *
     * @param string $documentation documentation
     *
     * @return $this
     */
    public function setDocumentation($documentation)
    {
        $this->container['documentation'] = $documentation;

        return $this;
    }

    /**
     * Gets entrypoint
     *
     * @return string[]
     */
    public function getEntrypoint()
    {
        return $this->container['entrypoint'];
    }

    /**
     * Sets entrypoint
     *
     * @param string[] $entrypoint entrypoint
     *
     * @return $this
     */
    public function setEntrypoint($entrypoint)
    {
        $this->container['entrypoint'] = $entrypoint;

        return $this;
    }

    /**
     * Gets env
     *
     * @return \Ory\Hydra\Client\Model\PluginEnv[]
     */
    public function getEnv()
    {
        return $this->container['env'];
    }

    /**
     * Sets env
     *
     * @param \Ory\Hydra\Client\Model\PluginEnv[] $env env
     *
     * @return $this
     */
    public function setEnv($env)
    {
        $this->container['env'] = $env;

        return $this;
    }

    /**
     * Gets interface
     *
     * @return \Ory\Hydra\Client\Model\PluginConfigInterface
     */
    public function getInterface()
    {
        return $this->container['interface'];
    }

    /**
     * Sets interface
     *
     * @param \Ory\Hydra\Client\Model\PluginConfigInterface $interface interface
     *
     * @return $this
     */
    public function setInterface($interface)
    {
        $this->container['interface'] = $interface;

        return $this;
    }

    /**
     * Gets ipcHost
     *
     * @return bool
     */
    public function getIpcHost()
    {
        return $this->container['ipcHost'];
    }

    /**
     * Sets ipcHost
     *
     * @param bool $ipcHost ipc host
     *
     * @return $this
     */
    public function setIpcHost($ipcHost)
    {
        $this->container['ipcHost'] = $ipcHost;

        return $this;
    }

    /**
     * Gets linux
     *
     * @return \Ory\Hydra\Client\Model\PluginConfigLinux
     */
    public function getLinux()
    {
        return $this->container['linux'];
    }

    /**
     * Sets linux
     *
     * @param \Ory\Hydra\Client\Model\PluginConfigLinux $linux linux
     *
     * @return $this
     */
    public function setLinux($linux)
    {
        $this->container['linux'] = $linux;

        return $this;
    }

    /**
     * Gets mounts
     *
     * @return \Ory\Hydra\Client\Model\PluginMount[]
     */
    public function getMounts()
    {
        return $this->container['mounts'];
    }

    /**
     * Sets mounts
     *
     * @param \Ory\Hydra\Client\Model\PluginMount[] $mounts mounts
     *
     * @return $this
     */
    public function setMounts($mounts)
    {
        $this->container['mounts'] = $mounts;

        return $this;
    }

    /**
     * Gets network
     *
     * @return \Ory\Hydra\Client\Model\PluginConfigNetwork
     */
    public function getNetwork()
    {
        return $this->container['network'];
    }

    /**
     * Sets network
     *
     * @param \Ory\Hydra\Client\Model\PluginConfigNetwork $network network
     *
     * @return $this
     */
    public function setNetwork($network)
    {
        $this->container['network'] = $network;

        return $this;
    }

    /**
     * Gets pidHost
     *
     * @return bool
     */
    public function getPidHost()
    {
        return $this->container['pidHost'];
    }

    /**
     * Sets pidHost
     *
     * @param bool $pidHost pid host
     *
     * @return $this
     */
    public function setPidHost($pidHost)
    {
        $this->container['pidHost'] = $pidHost;

        return $this;
    }

    /**
     * Gets propagatedMount
     *
     * @return string
     */
    public function getPropagatedMount()
    {
        return $this->container['propagatedMount'];
    }

    /**
     * Sets propagatedMount
     *
     * @param string $propagatedMount propagated mount
     *
     * @return $this
     */
    public function setPropagatedMount($propagatedMount)
    {
        $this->container['propagatedMount'] = $propagatedMount;

        return $this;
    }

    /**
     * Gets user
     *
     * @return \Ory\Hydra\Client\Model\PluginConfigUser|null
     */
    public function getUser()
    {
        return $this->container['user'];
    }

    /**
     * Sets user
     *
     * @param \Ory\Hydra\Client\Model\PluginConfigUser|null $user user
     *
     * @return $this
     */
    public function setUser($user)
    {
        $this->container['user'] = $user;

        return $this;
    }

    /**
     * Gets workDir
     *
     * @return string
     */
    public function getWorkDir()
    {
        return $this->container['workDir'];
    }

    /**
     * Sets workDir
     *
     * @param string $workDir work dir
     *
     * @return $this
     */
    public function setWorkDir($workDir)
    {
        $this->container['workDir'] = $workDir;

        return $this;
    }

    /**
     * Gets rootfs
     *
     * @return \Ory\Hydra\Client\Model\PluginConfigRootfs|null
     */
    public function getRootfs()
    {
        return $this->container['rootfs'];
    }

    /**
     * Sets rootfs
     *
     * @param \Ory\Hydra\Client\Model\PluginConfigRootfs|null $rootfs rootfs
     *
     * @return $this
     */
    public function setRootfs($rootfs)
    {
        $this->container['rootfs'] = $rootfs;

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


