/*
 * This file is part of the Scandit Data Capture SDK
 *
 * Copyright (C) 2024- Scandit AG. All rights reserved.
 */

@file:Suppress("PackageName")
package com.scandit.datacapture.reactnative.id_voided_detection

import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import com.scandit.datacapture.reactnative.core.ScanditReactPackageBase

class ScanditDataCaptureIdVoidedDetectionPackage : ScanditReactPackageBase() {
    override fun createNativeModules(
        reactContext: ReactApplicationContext
    ): MutableList<NativeModule> = mutableListOf(
        ScanditDataCaptureIdVoidedDetectionModule(reactContext)
    )

    override fun createViewManagers(
        reactContext: ReactApplicationContext
    ): MutableList<ViewManager<*, *>> = mutableListOf()

    override fun getModuleClasses(): List<Class<out NativeModule>> =
        listOf(ScanditDataCaptureIdVoidedDetectionModule::class.java)
}
