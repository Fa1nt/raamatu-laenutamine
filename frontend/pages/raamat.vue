<template>
  <div class="container">
    <h1 class="title">
      Raamatu laenutamine
    </h1>
    <raamat-list :raamatud="raamatud" />
  </div>
</template>

<script>
import RaamatList from '~/components/RaamatList.vue'
export default {
  components: {
    RaamatList
  },
  data () {
    return {
      raamatud: {
        type: Array
      }
    }
  },
  async asyncData (ctx) {
    return {
      raamatud: await ctx.app.$services.raamat.findAll()
    }
  }
}
</script>