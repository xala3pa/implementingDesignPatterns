package com.xala3pa.singleton

@Singleton
class GroovySingleton {
    int count = 0

    int increaseCounter() {
          count = count + 1
    }

}
