/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package sh.ory.client-kotlin-multiplatform.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import sh.ory.client-kotlin-multiplatform.models.InvoiceDataV1
import sh.ory.client-kotlin-multiplatform.models.LineItemV1
import sh.ory.client-kotlin-multiplatform.models.TaxLineItem
import sh.ory.client-kotlin-multiplatform.models.TimeInterval

class InvoiceDataV1Test : ShouldSpec() {
    init {
        // uncomment below to create an instance of InvoiceDataV1
        //val modelInstance = InvoiceDataV1()

        // to test the property `billingPeriod`
        should("test billingPeriod") {
            // uncomment below to test the property
            //modelInstance.billingPeriod shouldBe ("TODO")
        }

        // to test the property `currency` - The currency of the invoice.
        should("test currency") {
            // uncomment below to test the property
            //modelInstance.currency shouldBe ("TODO")
        }

        // to test the property `items` - The items that are part of this invoice.
        should("test items") {
            // uncomment below to test the property
            //modelInstance.items shouldBe ("TODO")
        }

        // to test the property `title` - The title of the invoice.
        should("test title") {
            // uncomment below to test the property
            //modelInstance.title shouldBe ("TODO")
        }

        // to test the property `totalInCent`
        should("test totalInCent") {
            // uncomment below to test the property
            //modelInstance.totalInCent shouldBe ("TODO")
        }

        // to test the property `deleted` - Deleted is true if the invoice has been soft-deleted.
        should("test deleted") {
            // uncomment below to test the property
            //modelInstance.deleted shouldBe ("TODO")
        }

        // to test the property `plan` - The plan that this invoice is based on, in the format \"Name@version\".
        should("test plan") {
            // uncomment below to test the property
            //modelInstance.plan shouldBe ("TODO")
        }

        // to test the property `stripeInvoiceItem`
        should("test stripeInvoiceItem") {
            // uncomment below to test the property
            //modelInstance.stripeInvoiceItem shouldBe ("TODO")
        }

        // to test the property `stripeInvoiceStatus` - The status of the invoice, one of `draft`, `open`, `paid`, `uncollectible`, or `void`. [Learn more](https://stripe.com/docs/billing/invoices/workflow#workflow-overview)
        should("test stripeInvoiceStatus") {
            // uncomment below to test the property
            //modelInstance.stripeInvoiceStatus shouldBe ("TODO")
        }

        // to test the property `stripeLink` - An optional link to the invoice on Stripe.
        should("test stripeLink") {
            // uncomment below to test the property
            //modelInstance.stripeLink shouldBe ("TODO")
        }

        // to test the property `subtitle` - The subtitle of the invoice.
        should("test subtitle") {
            // uncomment below to test the property
            //modelInstance.subtitle shouldBe ("TODO")
        }

        // to test the property `tax`
        should("test tax") {
            // uncomment below to test the property
            //modelInstance.tax shouldBe ("TODO")
        }

    }
}
