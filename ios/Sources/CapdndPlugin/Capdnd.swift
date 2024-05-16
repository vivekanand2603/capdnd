import Foundation

@objc public class Capdnd: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
