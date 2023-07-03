import 'dart:io';
import 'abstract_log_product.dart';

final class ConcreteFileLogProduct implements AbstractLogProduct {
  late final String filename;

  ConcreteFileLogProduct(final String path) {
    this.filename = "log";
    //_makeFile();
  }

  @override
  bool log(String message) {
    File(this.filename).writeAsString(message);

    return true;
  }
}
