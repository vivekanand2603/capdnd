// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "Capdnd",
    platforms: [.iOS(.v13)],
    products: [
        .library(
            name: "Capdnd",
            targets: ["CapdndPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", branch: "main")
    ],
    targets: [
        .target(
            name: "CapdndPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/CapdndPlugin"),
        .testTarget(
            name: "CapdndPluginTests",
            dependencies: ["CapdndPlugin"],
            path: "ios/Tests/CapdndPluginTests")
    ]
)