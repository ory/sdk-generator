/**
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.7.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from '../api';
import { PluginInterfaceType } from './pluginInterfaceType';

/**
* PluginConfigInterface The interface between Docker and the plugin
*/
export class PluginConfigInterface {
    /**
    * socket
    */
    'socket': string;
    /**
    * types
    */
    'types': Array<PluginInterfaceType>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "socket",
            "baseName": "Socket",
            "type": "string"
        },
        {
            "name": "types",
            "baseName": "Types",
            "type": "Array<PluginInterfaceType>"
        }    ];

    static getAttributeTypeMap() {
        return PluginConfigInterface.attributeTypeMap;
    }
}

