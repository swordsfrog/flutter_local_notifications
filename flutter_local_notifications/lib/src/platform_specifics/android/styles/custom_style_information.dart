import 'style_information.dart';
import 'default_style_information.dart';

/// The Custom Android notification style.
class CustomStyleInformation extends DefaultStyleInformation {
    /// Constructs an instance of [CustomStyleInformation].
    const CustomStyleInformation({
        required this.customContentView,
        this.customBigContentView,
        this.viewTexts = const {}
    }): super(false, false);

    final String customContentView;

    final String? customBigContentView;

    final Map<String, String> viewTexts;
}