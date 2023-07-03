import 'dart:async';

import 'abstract_log_product.dart';

final class ConcreteTerminalLogProduct implements AbstractLogProduct {
  @override
  bool log(final String message) {
    print(message);

    return true;
  }
}
