<template>
  <div id="app"><!-- 用于css -->
    <element-view></element-view>
  </div>
</template>

<script>
import ElementView from './views/element/ElementView.vue'
export default {
  components: { ElementView },
  data:function(){
    return {
      message:"Hello Vue"
    }
  }
}
</script>


<style>/* css */

</style>
