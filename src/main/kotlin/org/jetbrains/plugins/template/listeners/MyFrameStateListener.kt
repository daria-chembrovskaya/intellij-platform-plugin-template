package org.jetbrains.plugins.template.listeners

import com.intellij.ide.FrameStateListener
import com.intellij.openapi.diagnostic.thisLogger

internal class MyFrameStateListener : FrameStateListener {

    override fun onFrameActivated() {
        thisLogger().info("Frame activated")

        System.getenv("CI")
            ?: TODO("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}