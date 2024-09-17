<?php
/**
 * InvoiceDataV1
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
 * The version of the OpenAPI document: v1.15.0
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
 * InvoiceDataV1 Class Doc Comment
 *
 * @category Class
 * @package  Ory\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class InvoiceDataV1 implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'InvoiceDataV1';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'billingPeriod' => '\Ory\Client\Model\TimeInterval',
        'currency' => 'string',
        'deleted' => 'bool',
        'items' => '\Ory\Client\Model\LineItemV1[]',
        'plan' => 'string',
        'stripeInvoiceItem' => 'string',
        'stripeInvoiceStatus' => 'string',
        'stripeLink' => 'string',
        'subtitle' => 'string',
        'tax' => '\Ory\Client\Model\TaxLineItem',
        'title' => 'string',
        'totalInCent' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'billingPeriod' => null,
        'currency' => null,
        'deleted' => null,
        'items' => null,
        'plan' => null,
        'stripeInvoiceItem' => null,
        'stripeInvoiceStatus' => null,
        'stripeLink' => null,
        'subtitle' => null,
        'tax' => null,
        'title' => null,
        'totalInCent' => 'int64'
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'billingPeriod' => false,
        'currency' => false,
        'deleted' => false,
        'items' => false,
        'plan' => false,
        'stripeInvoiceItem' => false,
        'stripeInvoiceStatus' => false,
        'stripeLink' => false,
        'subtitle' => false,
        'tax' => false,
        'title' => false,
        'totalInCent' => false
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
        'billingPeriod' => 'billing_period',
        'currency' => 'currency',
        'deleted' => 'deleted',
        'items' => 'items',
        'plan' => 'plan',
        'stripeInvoiceItem' => 'stripe_invoice_item',
        'stripeInvoiceStatus' => 'stripe_invoice_status',
        'stripeLink' => 'stripe_link',
        'subtitle' => 'subtitle',
        'tax' => 'tax',
        'title' => 'title',
        'totalInCent' => 'total_in_cent'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'billingPeriod' => 'setBillingPeriod',
        'currency' => 'setCurrency',
        'deleted' => 'setDeleted',
        'items' => 'setItems',
        'plan' => 'setPlan',
        'stripeInvoiceItem' => 'setStripeInvoiceItem',
        'stripeInvoiceStatus' => 'setStripeInvoiceStatus',
        'stripeLink' => 'setStripeLink',
        'subtitle' => 'setSubtitle',
        'tax' => 'setTax',
        'title' => 'setTitle',
        'totalInCent' => 'setTotalInCent'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'billingPeriod' => 'getBillingPeriod',
        'currency' => 'getCurrency',
        'deleted' => 'getDeleted',
        'items' => 'getItems',
        'plan' => 'getPlan',
        'stripeInvoiceItem' => 'getStripeInvoiceItem',
        'stripeInvoiceStatus' => 'getStripeInvoiceStatus',
        'stripeLink' => 'getStripeLink',
        'subtitle' => 'getSubtitle',
        'tax' => 'getTax',
        'title' => 'getTitle',
        'totalInCent' => 'getTotalInCent'
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
        $this->setIfExists('billingPeriod', $data ?? [], null);
        $this->setIfExists('currency', $data ?? [], null);
        $this->setIfExists('deleted', $data ?? [], null);
        $this->setIfExists('items', $data ?? [], null);
        $this->setIfExists('plan', $data ?? [], null);
        $this->setIfExists('stripeInvoiceItem', $data ?? [], null);
        $this->setIfExists('stripeInvoiceStatus', $data ?? [], null);
        $this->setIfExists('stripeLink', $data ?? [], null);
        $this->setIfExists('subtitle', $data ?? [], null);
        $this->setIfExists('tax', $data ?? [], null);
        $this->setIfExists('title', $data ?? [], null);
        $this->setIfExists('totalInCent', $data ?? [], null);
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

        if ($this->container['billingPeriod'] === null) {
            $invalidProperties[] = "'billingPeriod' can't be null";
        }
        if ($this->container['currency'] === null) {
            $invalidProperties[] = "'currency' can't be null";
        }
        if ($this->container['items'] === null) {
            $invalidProperties[] = "'items' can't be null";
        }
        if ($this->container['title'] === null) {
            $invalidProperties[] = "'title' can't be null";
        }
        if ($this->container['totalInCent'] === null) {
            $invalidProperties[] = "'totalInCent' can't be null";
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
     * Gets billingPeriod
     *
     * @return \Ory\Client\Model\TimeInterval
     */
    public function getBillingPeriod()
    {
        return $this->container['billingPeriod'];
    }

    /**
     * Sets billingPeriod
     *
     * @param \Ory\Client\Model\TimeInterval $billingPeriod billingPeriod
     *
     * @return self
     */
    public function setBillingPeriod($billingPeriod)
    {
        if (is_null($billingPeriod)) {
            throw new \InvalidArgumentException('non-nullable billingPeriod cannot be null');
        }
        $this->container['billingPeriod'] = $billingPeriod;

        return $this;
    }

    /**
     * Gets currency
     *
     * @return string
     */
    public function getCurrency()
    {
        return $this->container['currency'];
    }

    /**
     * Sets currency
     *
     * @param string $currency The currency of the invoice.
     *
     * @return self
     */
    public function setCurrency($currency)
    {
        if (is_null($currency)) {
            throw new \InvalidArgumentException('non-nullable currency cannot be null');
        }
        $this->container['currency'] = $currency;

        return $this;
    }

    /**
     * Gets deleted
     *
     * @return bool|null
     */
    public function getDeleted()
    {
        return $this->container['deleted'];
    }

    /**
     * Sets deleted
     *
     * @param bool|null $deleted Deleted is true if the invoice has been soft-deleted.
     *
     * @return self
     */
    public function setDeleted($deleted)
    {
        if (is_null($deleted)) {
            throw new \InvalidArgumentException('non-nullable deleted cannot be null');
        }
        $this->container['deleted'] = $deleted;

        return $this;
    }

    /**
     * Gets items
     *
     * @return \Ory\Client\Model\LineItemV1[]
     */
    public function getItems()
    {
        return $this->container['items'];
    }

    /**
     * Sets items
     *
     * @param \Ory\Client\Model\LineItemV1[] $items The items that are part of this invoice.
     *
     * @return self
     */
    public function setItems($items)
    {
        if (is_null($items)) {
            throw new \InvalidArgumentException('non-nullable items cannot be null');
        }
        $this->container['items'] = $items;

        return $this;
    }

    /**
     * Gets plan
     *
     * @return string|null
     */
    public function getPlan()
    {
        return $this->container['plan'];
    }

    /**
     * Sets plan
     *
     * @param string|null $plan The plan that this invoice is based on, in the format \"Name@version\".
     *
     * @return self
     */
    public function setPlan($plan)
    {
        if (is_null($plan)) {
            throw new \InvalidArgumentException('non-nullable plan cannot be null');
        }
        $this->container['plan'] = $plan;

        return $this;
    }

    /**
     * Gets stripeInvoiceItem
     *
     * @return string|null
     */
    public function getStripeInvoiceItem()
    {
        return $this->container['stripeInvoiceItem'];
    }

    /**
     * Sets stripeInvoiceItem
     *
     * @param string|null $stripeInvoiceItem stripeInvoiceItem
     *
     * @return self
     */
    public function setStripeInvoiceItem($stripeInvoiceItem)
    {
        if (is_null($stripeInvoiceItem)) {
            throw new \InvalidArgumentException('non-nullable stripeInvoiceItem cannot be null');
        }
        $this->container['stripeInvoiceItem'] = $stripeInvoiceItem;

        return $this;
    }

    /**
     * Gets stripeInvoiceStatus
     *
     * @return string|null
     */
    public function getStripeInvoiceStatus()
    {
        return $this->container['stripeInvoiceStatus'];
    }

    /**
     * Sets stripeInvoiceStatus
     *
     * @param string|null $stripeInvoiceStatus The status of the invoice, one of `draft`, `open`, `paid`, `uncollectible`, or `void`. [Learn more](https://stripe.com/docs/billing/invoices/workflow#workflow-overview)
     *
     * @return self
     */
    public function setStripeInvoiceStatus($stripeInvoiceStatus)
    {
        if (is_null($stripeInvoiceStatus)) {
            throw new \InvalidArgumentException('non-nullable stripeInvoiceStatus cannot be null');
        }
        $this->container['stripeInvoiceStatus'] = $stripeInvoiceStatus;

        return $this;
    }

    /**
     * Gets stripeLink
     *
     * @return string|null
     */
    public function getStripeLink()
    {
        return $this->container['stripeLink'];
    }

    /**
     * Sets stripeLink
     *
     * @param string|null $stripeLink An optional link to the invoice on Stripe.
     *
     * @return self
     */
    public function setStripeLink($stripeLink)
    {
        if (is_null($stripeLink)) {
            throw new \InvalidArgumentException('non-nullable stripeLink cannot be null');
        }
        $this->container['stripeLink'] = $stripeLink;

        return $this;
    }

    /**
     * Gets subtitle
     *
     * @return string|null
     */
    public function getSubtitle()
    {
        return $this->container['subtitle'];
    }

    /**
     * Sets subtitle
     *
     * @param string|null $subtitle The subtitle of the invoice.
     *
     * @return self
     */
    public function setSubtitle($subtitle)
    {
        if (is_null($subtitle)) {
            throw new \InvalidArgumentException('non-nullable subtitle cannot be null');
        }
        $this->container['subtitle'] = $subtitle;

        return $this;
    }

    /**
     * Gets tax
     *
     * @return \Ory\Client\Model\TaxLineItem|null
     */
    public function getTax()
    {
        return $this->container['tax'];
    }

    /**
     * Sets tax
     *
     * @param \Ory\Client\Model\TaxLineItem|null $tax tax
     *
     * @return self
     */
    public function setTax($tax)
    {
        if (is_null($tax)) {
            throw new \InvalidArgumentException('non-nullable tax cannot be null');
        }
        $this->container['tax'] = $tax;

        return $this;
    }

    /**
     * Gets title
     *
     * @return string
     */
    public function getTitle()
    {
        return $this->container['title'];
    }

    /**
     * Sets title
     *
     * @param string $title The title of the invoice.
     *
     * @return self
     */
    public function setTitle($title)
    {
        if (is_null($title)) {
            throw new \InvalidArgumentException('non-nullable title cannot be null');
        }
        $this->container['title'] = $title;

        return $this;
    }

    /**
     * Gets totalInCent
     *
     * @return int
     */
    public function getTotalInCent()
    {
        return $this->container['totalInCent'];
    }

    /**
     * Sets totalInCent
     *
     * @param int $totalInCent totalInCent
     *
     * @return self
     */
    public function setTotalInCent($totalInCent)
    {
        if (is_null($totalInCent)) {
            throw new \InvalidArgumentException('non-nullable totalInCent cannot be null');
        }
        $this->container['totalInCent'] = $totalInCent;

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


