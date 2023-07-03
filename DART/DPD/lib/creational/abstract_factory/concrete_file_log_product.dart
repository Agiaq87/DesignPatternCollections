import 'dart:io';
import 'abstract_log_product.dart';

final class ConcreteFileLogProduct implements AbstractLogProduct {
  late final String filename;
  File? file;

  ConcreteFileLogProduct(final String? path) {
    this.filename = "log.txt";
  }

  @override
  bool log(String message) {
    File(this.filename).writeAsString(message).whenComplete(() => true);

    return false;
  }
}
