#!/usr/bin/env bash
set -euxo pipefail

# install sdkman to install multiple java
# curl -s "https://get.sdkman.io" | bash

sdk version

# sdk install java x.y.z-tem

sdk install java 8.0.452-tem

sdk install java 17.0.15-tem

sdk install java 21.0.7-tem

sdk current java

sdk env

sdk env install

java -version