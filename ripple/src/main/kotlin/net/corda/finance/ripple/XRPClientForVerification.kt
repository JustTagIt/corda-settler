package net.corda.finance.ripple

import java.net.URI

/** Whoever is verifying will specify the server they want to use. */
class XRPClientForVerification(override val nodeUri: URI) : ReadOnlyXRPClient